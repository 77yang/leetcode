package com.qyang2.btc


import com.alibaba.fastjson.JSON
import com.huobi.client.SubscriptionClient
import com.huobi.client.model.enums.CandlestickInterval
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
class BTCClient {

    private val log = LoggerFactory.getLogger(BTCClient::class.java)


    @Autowired
    private val emailSender: EmailSender? = null

    @Autowired
    private val appConfig: AppConfig? = null

    private var lastSendTime = System.currentTimeMillis()

    val apiKey = ""
    val secretKey = ""
    val targetEmail = ""



    @PostConstruct
    fun start() {


        val subscriptionClient = SubscriptionClient.create(apiKey,
                secretKey)

        subscriptionClient.subscribeCandlestickEvent("btcusdt", CandlestickInterval.MIN60, { data ->
            val candlestick = data.data

            val close = candlestick.close.toDouble()
            val open = candlestick.open.toDouble()
            val high = candlestick.high.toDouble()
            val low = candlestick.low.toDouble()
            val pH = (high - open) / close * 100
            val pL = (low - open) / close * 100
            val pN = (close - open) / open * 100
            var stringFormat="%.2f"


            log.info("now=$close pN=${String.format(stringFormat,pN)} pL=${String.format(stringFormat,pL)} pH=${String.format(stringFormat,pH)}")

            val now = System.currentTimeMillis()
            if (now - lastSendTime < appConfig!!.alertInterval.toLong()) {
                return@subscribeCandlestickEvent
            }

            lastSendTime = now

            if (close > appConfig.high.toDouble()) {
                emailSender!!.send(targetEmail, "High-Alert now=$close", JSON.toJSONString(candlestick))
            }
            if (close < appConfig.low.toDouble()) {
                emailSender!!.send(targetEmail, "Low-Alert now=$close", JSON.toJSONString(candlestick))
            }


        }, { e -> log.error("occur an exception.", e) })

    }
}

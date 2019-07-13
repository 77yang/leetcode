package com.qyang2.btc


import com.alibaba.fastjson.JSON
import com.huobi.client.SubscriptionClient
import com.huobi.client.model.enums.CandlestickInterval
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct
import kotlin.math.abs

@Component
class BTCClient {

    private val log = LoggerFactory.getLogger(BTCClient::class.java)


    @Autowired
    private val emailSender: EmailSender? = null

    private var  lastSavePrice = 0



    private var lastSendTime = System.currentTimeMillis()

    val apiKey = "87861923-dab4c45e6f-4d33ec97-bd64e"
    val secretKey = "a040ee49-6cee4c0c-205e4e64-eeb9f"
    val targetEmail = "501294009@qq.com"



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

            if(lastSavePrice <= 0) {
                lastSavePrice = close.toInt()
            }


            val differenceP = abs(close.toInt() - lastSavePrice)


            log.info("now=$close pN=${String.format(stringFormat,pN)} pL=${String.format(stringFormat,pL)} pH=${String.format(stringFormat,pH)} dF=$differenceP")


            if (differenceP >= AppConfig.priceInterval) {
                emailSender!!.send(targetEmail, "Threshold-Alert now=$close dF=$differenceP", JSON.toJSONString(candlestick))
                lastSavePrice = close.toInt()
            }



            val now = System.currentTimeMillis()
            if (now - lastSendTime < AppConfig.alertInterval.toLong()) {
                return@subscribeCandlestickEvent
            }

            lastSendTime = now

            if (close > AppConfig.high.toDouble()) {
                emailSender!!.send(targetEmail, "High-Alert now=$close", JSON.toJSONString(candlestick))
            }
            if (close < AppConfig.low.toDouble()) {
                emailSender!!.send(targetEmail, "Low-Alert now=$close", JSON.toJSONString(candlestick))
            }


        }, { e -> log.error("occur an exception.", e) })

    }
}

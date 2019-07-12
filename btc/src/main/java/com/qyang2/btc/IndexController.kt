package com.qyang2.btc

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("index")
class IndexController {

    @Autowired
    private lateinit var appConfig:AppConfig
    @GetMapping("configs")
    fun getConfigs(model: Model): String {
        model["appConfig"] = appConfig
        return "index"
    }


    @GetMapping("changeConfig")
    fun changeConfig(name:String,value:String,model: Model):String {
        when (name) {
            "low" -> appConfig.low = value.toBigDecimal()
            "high" -> appConfig.high = value.toBigDecimal()
            "alertInterval" -> appConfig.alertInterval = value
        }
        return "redirect:configs"
    }
}
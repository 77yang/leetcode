package com.qyang2.btc

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("index")
class IndexController {


    @GetMapping("configs")
    fun getConfigs(model: Model): String {
        model["appConfig"] = AppConfig
        return "index"
    }


    @GetMapping("changeConfig")
    fun changeConfig(name:String,value:String):String {
        when (name) {
            "low" -> AppConfig.low = value.toInt()
            "high" -> AppConfig.high = value.toInt()
            "alertInterval" -> AppConfig.alertInterval = value.toInt()
            "priceInterval" -> AppConfig.priceInterval = value.toInt()
        }
        return "redirect:configs"
    }
}
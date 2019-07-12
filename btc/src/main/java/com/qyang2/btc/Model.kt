package com.qyang2.btc

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Configuration
import java.math.BigDecimal


@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "app-config")
 open class AppConfig {
    lateinit var alertInterval: String
    lateinit var high:BigDecimal
    lateinit var low:BigDecimal
}


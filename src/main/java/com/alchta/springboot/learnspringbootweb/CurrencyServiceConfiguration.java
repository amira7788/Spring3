package com.alchta.springboot.learnspringbootweb;
//currency-service.url=
//        currency-service.username=
//        currency-service.key=

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "currency-service")
@Component
@Getter
@Setter
public class CurrencyServiceConfiguration {

    private String url;
    private String username;
    private String KEY;

}

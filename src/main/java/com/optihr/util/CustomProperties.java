package com.optihr.util;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "com.optihr")
@Data
public class CustomProperties {
    private String apiUrl ;
}

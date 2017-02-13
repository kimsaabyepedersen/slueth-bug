package com.example;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "my.props")
class MyProperties {

    private final Map<String, Integer> expiry = new HashMap<>();

    public Map<String, Integer> getExpiry() {
        return expiry;
    }

}
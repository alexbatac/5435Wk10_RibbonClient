package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class RibbonConfiguration {
		
    @Autowired
    IClientConfig config;

    @Bean
    public IPing ribbonPing(IClientConfig config) {
        return new PingUrl();
    }

    @Bean
    public IRule ribbonRule(IClientConfig config) {
        return new AvailabilityFilteringRule();
    }
}
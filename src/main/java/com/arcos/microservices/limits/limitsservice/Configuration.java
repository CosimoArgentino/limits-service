package com.arcos.microservices.limits.limitsservice;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
public class Configuration {
    @Getter @Setter
    private int minimum;
    @Getter @Setter
    private int maximum;
}

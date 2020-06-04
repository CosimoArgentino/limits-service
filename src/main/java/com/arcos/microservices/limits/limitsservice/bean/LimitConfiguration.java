package com.arcos.microservices.limits.limitsservice.bean;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class LimitConfiguration {
    @Getter @Setter
    private int minimum;
    @Getter @Setter
    private int maximum;

    protected LimitConfiguration(){

    }


}

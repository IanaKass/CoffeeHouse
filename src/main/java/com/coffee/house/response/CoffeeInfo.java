package com.coffee.house.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CoffeeInfo {
    private String coffeeName;
    private Money price;
}

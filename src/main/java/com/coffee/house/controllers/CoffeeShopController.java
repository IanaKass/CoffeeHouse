package com.coffee.house.controllers;

import com.coffee.house.model.CoffeeKind;
import com.coffee.house.response.CoffeeInfo;
import com.coffee.house.response.CoffeeListResponse;
import com.coffee.house.response.Money;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.stream.Collectors;

@RestController
public class CoffeeShopController {

    @GetMapping(value = "/list")
    public CoffeeListResponse getList() {

        var list = Arrays.stream(CoffeeKind.values()).map(
                kind -> CoffeeInfo.builder()
                        .coffeeName(kind.getTitle())
                        .price(buildMoneyWith(kind.getPrice()))
                        .build()
        ).collect(Collectors.toList());

        var response = new CoffeeListResponse();
        response.setCoffeeList(list);
        return response;
    }

    private Money buildMoneyWith(double price) {
        return Money.builder()
                .amount(
                        BigDecimal.valueOf(price))
                .currency("AMD").build();
    }

}

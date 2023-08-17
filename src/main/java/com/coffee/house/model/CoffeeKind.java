package com.coffee.house.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CoffeeKind {
    ESPRESSO("Espresso", 50.0),
    LATTE("Latte", 80.0),
    CAPPUCCINO("Cappuccino", 80.0),
    ICED_COFFEE("Iced coffee", 70.0);

    private final String title;
    private final double price;

}

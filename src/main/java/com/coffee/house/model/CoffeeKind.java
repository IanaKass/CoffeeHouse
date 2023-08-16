package com.coffee.house.model;

public enum CoffeeKind {
    ESPRESSO("Espresso", 50.0),
    LATTE("Latte", 80.0),
    CAPPUCCINO("Cappuccino", 80.0),
    ICED_COFFEE("Iced coffee", 70.0);

    private final String title;
    private final double price;

    CoffeeKind(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

}

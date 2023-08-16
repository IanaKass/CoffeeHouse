package com.coffee.house.response;

import lombok.Builder;

import java.math.BigDecimal;
@Builder
public record Money(BigDecimal amount, String currency) {
}

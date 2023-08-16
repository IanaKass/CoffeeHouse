package com.coffee.house.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CoffeeListResponse extends BaseResponse {
    private List<CoffeeInfo> coffeeList;
}

package com.pooja.product_service.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ProductRequest {
    @NotNull
    @NotBlank(message = "Product Name is Required")
    private String productName;
    private String description;
    @Min(value = 0, message = "Price should be > 0")
    private Double price;
    private Integer qty;
}
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
    @NotBlank
    private String productName;
    private Integer id;
    private String description;
    @Min(0)
    private Double price;


}

//Sample Json Request

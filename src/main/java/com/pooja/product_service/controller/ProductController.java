package com.pooja.product_service.controller;

import com.pooja.product_service.model.ProductRequest;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    List<ProductRequest> productRequestList = new ArrayList<ProductRequest>();
    @PostMapping("/save")
    public String saveProduct(@RequestBody ProductRequest productRequest) {
        productRequestList.add(productRequest);
        String msg = "Saved Succesfully";
        return msg;
    }
    @GetMapping
    public List<ProductRequest> getProduct() {
        return productRequestList;
    }
}

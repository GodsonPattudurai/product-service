package com.pooja.product_service.controller;

import com.pooja.product_service.entity.Product;
import com.pooja.product_service.model.ProductRequest;
import com.pooja.product_service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;
    @PostMapping("/save")
    public Integer saveProduct(@RequestBody ProductRequest productRequest) {

        return productService.saveProduct(productRequest);
    }
    @GetMapping
    public List<Product> getProduct() {
        return productService.getProduct();
    }
}

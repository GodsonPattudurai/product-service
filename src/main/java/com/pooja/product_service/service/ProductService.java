package com.pooja.product_service.service;

import com.pooja.product_service.entity.Product;
import com.pooja.product_service.model.ProductRequest;
import com.pooja.product_service.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    public Integer saveProduct(ProductRequest productRequest) {
        Product product = Product.builder().qty(productRequest.getQty())
                .price(productRequest.getPrice())
                .name(productRequest.getProductName())
                .description(productRequest.getDescription()).build();

        productRepository.save(product);
        return product.getId();
    }

    public List<Product> getProduct() {
        return productRepository.findAll();
    }





//    List<ProductRequest> productRequestList = new ArrayList<ProductRequest>();
//    public String saveProduct(ProductRequest productRequest) {
//        productRequestList.add(productRequest);
//        String msg = "Saved Succesfully";
//        return msg;
//    }
//
//    public List<ProductRequest> getProduct() {
//        return productRequestList;
//    }

}

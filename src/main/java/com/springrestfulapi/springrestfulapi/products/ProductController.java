package com.springrestfulapi.springrestfulapi.products;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @GetMapping("/product")
    public String getProduct() {
        return "product";
    }
}

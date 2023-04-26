package ru.application.partexchange.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.application.partexchange.dto.ProductDto;
import ru.application.partexchange.dto.ProductDtoCreate;
import ru.application.partexchange.service.ProductService;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("")
    public ResponseEntity<List<ProductDto>> getAllProducts(){
        return new ResponseEntity<>(productService.getAll(), HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<?> createProduct(@RequestBody ProductDtoCreate request){
        productService.create(request);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}

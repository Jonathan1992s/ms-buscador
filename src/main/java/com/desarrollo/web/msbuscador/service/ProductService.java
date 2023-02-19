package com.desarrollo.web.msbuscador.service;

import com.desarrollo.web.msbuscador.model.pojo.Product;
import com.desarrollo.web.msbuscador.model.request.CreateProductRequest;

import java.util.List;

public interface ProductService {



    List<Product> getProducts();

    Product getProductById(String id);
    Product createProduct(CreateProductRequest request);
}

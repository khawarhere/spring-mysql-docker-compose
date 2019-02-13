package com.khawarhere.demo.service;


import com.khawarhere.demo.model.Product;

import java.util.List;

/**
 * Created by khawar on 2/13/19.
 */
public interface ProductService {
    public Product save(Product item);
    public List<Product> findAll();
}

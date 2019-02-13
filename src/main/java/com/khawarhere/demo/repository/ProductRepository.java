package com.khawarhere.demo.repository;

import com.khawarhere.demo.model.Product;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by khawar on 2/13/19.
 */
public interface ProductRepository extends CrudRepository<Product, Long> {

}

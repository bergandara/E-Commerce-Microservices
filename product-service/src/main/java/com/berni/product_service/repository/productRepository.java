package com.berni.product_service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.berni.product_service.model.Product;

public interface productRepository extends MongoRepository<Product, String> {
}

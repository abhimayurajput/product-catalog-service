package com.neosoft.ProductCatalogService.service;


import com.neosoft.ProductCatalogService.model.Product;

import java.util.List;

public interface ProductService {
    public List<Product> getAllProduct();
    public List<Product> getAllProductByCategory(String category);
    public Product getProductById(Long id);
    public List<Product> getAllProductsByName(String name);
    public Product addProduct(Product product);
    public void deleteProduct(Long productId);
}

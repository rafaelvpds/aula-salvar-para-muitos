package com.devsuperior.aulasalvarparamuitos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.aulasalvarparamuitos.dto.CategoryDto;
import com.devsuperior.aulasalvarparamuitos.dto.ProductDto;
import com.devsuperior.aulasalvarparamuitos.entities.Category;
import com.devsuperior.aulasalvarparamuitos.entities.Product;
import com.devsuperior.aulasalvarparamuitos.repositories.CategoryRepository;
import com.devsuperior.aulasalvarparamuitos.repositories.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;
    @Autowired
    private CategoryRepository repositoryCat;

    public ProductDto insert(ProductDto dto) {
        Product product = new Product();

        product.setName(dto.getName());
        product.setPrice(dto.getPrice());
        for (CategoryDto catDto : dto.getCategories()) {
            Category cat = repositoryCat.getReferenceById(catDto.getId());
            // Category cat = new Category();
            // cat.setId(catDto.getId());
            product.getCategories().add(cat);
        }

        product = repository.save(product);

        return new ProductDto(product);

    }
}

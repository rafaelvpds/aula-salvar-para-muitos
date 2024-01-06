package com.devsuperior.aulasalvarparamuitos.dto;

import java.util.ArrayList;
import java.util.List;

import com.devsuperior.aulasalvarparamuitos.entities.Category;
import com.devsuperior.aulasalvarparamuitos.entities.Product;

public class ProductDto {
    private Long id;
    private String name;
    private Double price;
    private List<CategoryDto> categories = new ArrayList<>();

    public ProductDto(Long id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;

    }

    public ProductDto(Product entity) {
        id = entity.getId();
        name = entity.getName();
        price = entity.getPrice();
        for (Category cat : entity.getCategories()) {
            categories.add(new CategoryDto(cat));
        }
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public List<CategoryDto> getCategories() {
        return categories;
    }

}

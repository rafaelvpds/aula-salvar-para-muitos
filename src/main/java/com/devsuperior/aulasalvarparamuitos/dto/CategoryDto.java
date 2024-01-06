package com.devsuperior.aulasalvarparamuitos.dto;

import com.devsuperior.aulasalvarparamuitos.entities.Category;

public class CategoryDto {
    private Long id;
    private String name;

    public CategoryDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public CategoryDto(Category entity) {
        id = entity.getId();
        name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}

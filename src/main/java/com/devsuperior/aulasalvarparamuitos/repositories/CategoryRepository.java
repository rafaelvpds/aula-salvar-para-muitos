package com.devsuperior.aulasalvarparamuitos.repositories;

import com.devsuperior.aulasalvarparamuitos.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}

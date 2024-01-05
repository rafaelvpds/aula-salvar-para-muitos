package com.devsuperior.aulasalvarparamuitos.repositories;

import com.devsuperior.aulasalvarparamuitos.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

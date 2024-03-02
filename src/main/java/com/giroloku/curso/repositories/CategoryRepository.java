package com.giroloku.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.giroloku.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}

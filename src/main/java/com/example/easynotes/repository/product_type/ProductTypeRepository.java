package com.example.easynotes.repository.product_type;

import com.example.easynotes.model.product_type.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface ProductTypeRepository extends JpaRepository<ProductType,Long> {
    Optional<ProductType> findProductTypeById(Long id);

    void deleteProductTypesById(Long id);
}

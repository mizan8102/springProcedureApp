package com.example.easynotes.services.product_type;


import com.example.easynotes.dto.product_type.ProductTypeDto;
import com.example.easynotes.model.product_type.ProductType;
import com.example.easynotes.repository.product_type.ProductTypeRepository;
import com.example.easynotes.utils.SimplePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class ProductTypeService {

    @Autowired
    ProductTypeRepository productTypeRepository;

    public SimplePage<ProductTypeDto> findProductTypes(Pageable pageable) {
        Page<ProductType> page =  productTypeRepository.findAll(pageable);
        return new SimplePage<>(page.getContent()
                .stream()
                .map(this::transferToDTO)
                .collect(Collectors.toList()),
                page.getTotalElements(), pageable);
    }

    private ProductTypeDto transferToDTO(ProductType entity){
        ProductTypeDto dto = new ProductTypeDto();
        dto.setId(entity.getId());
        dto.setProdTypeName(entity.getProdTypeName());
        dto.setProdTypeNameBn(entity.getProdTypeNameBn());
        dto.setSequenceNumber(entity.getSequenceNumber());
        dto.setActive(entity.isActive());
        return dto;
    }
}

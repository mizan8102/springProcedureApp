package com.example.easynotes.dto.product_type;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductTypeDto {
    private Long id;
    private String prodTypeName;
    private String prodTypeNameBn;
    private int sequenceNumber;
    private boolean isActive;
}

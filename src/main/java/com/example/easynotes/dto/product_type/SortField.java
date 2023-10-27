package com.example.easynotes.dto.product_type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum  SortField {
    ID("id"),
    NAME("name"),
    PHONE_NUMBER("phoneNumber");

    private final String dbFieldName;
}

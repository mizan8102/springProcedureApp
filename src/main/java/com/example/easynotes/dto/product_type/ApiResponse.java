package com.example.easynotes.dto.product_type;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse {

    private int code;
    private String message;
    private Object result;
}

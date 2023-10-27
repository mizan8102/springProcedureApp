package com.example.easynotes.controller.product_type;

import com.example.easynotes.dto.product_type.ApiResponse;
import com.example.easynotes.dto.product_type.SortField;
import com.example.easynotes.services.product_type.ProductTypeService;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product-type")
public class ProductTypeController {

    private ProductTypeService productTypeService;

    ProductTypeController(ProductTypeService productTypeService){
        this.productTypeService = productTypeService;
    }


    @GetMapping("/all")
    public ResponseEntity<ApiResponse> getBankInfos (
            @RequestParam(defaultValue = "0") int pageNo,
            @RequestParam(defaultValue = "10") int pageSize,
            @RequestParam(defaultValue = "ID") SortField sortField,
            @RequestParam(defaultValue = "DESC") Sort.Direction sortDirection,
            @RequestParam(defaultValue = "") String filter
    ) {

        ApiResponse apiResponse;

        Pageable pageable = PageRequest.of(pageNo, pageSize, sortDirection, sortField.getDbFieldName());

        try {
            var results = productTypeService.findProductTypes(pageable);

            if (results.hasContent()) {
                apiResponse = new ApiResponse(200, "Paginated results", results);
            } else {
                apiResponse = new ApiResponse(404, "No Records Found!", "");
            }

        }catch (Exception e){
            apiResponse = new ApiResponse(500,e.getMessage(),"");
        }

        return  new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.OK);
    }
}

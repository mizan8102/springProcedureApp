package com.example.easynotes.model.product_type;


import lombok.*;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "5f_sv_product_type")
public class ProductType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable=false, updatable=false)
    private Long id;
    @Column(name ="prod_cat_id",nullable = false, updatable = true)
    private int prodCatId;

    @Column(name ="prod_type_name", nullable = false, updatable = true)
    private String prodTypeName;

    @Column(name ="prod_type_name_bn", nullable = false, updatable = true)
    private String prodTypeNameBn;

    @Column(name ="seq_number", nullable = false, updatable = true)
    private int sequenceNumber;

    @Column(name ="is_active", nullable = false, updatable = true)
    private boolean isActive;

    @Column(name ="created_at", nullable = true, updatable = true)
    private Date createdAt;

    @Column(name ="updated_at", nullable = true, updatable = true)
    private Date updatedAt;

    @Column(name ="created_by", nullable = true, updatable = true)
    private Integer createdBy;

    @Column(name ="updated_by", nullable = true, updatable = true)
    private Integer updatedBy;

}

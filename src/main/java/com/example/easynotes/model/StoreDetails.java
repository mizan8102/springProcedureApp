package com.example.easynotes.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StoreDetails {
    @Id
    private Long storeId;
    private String storeName;
    private String storeNameBn;
}

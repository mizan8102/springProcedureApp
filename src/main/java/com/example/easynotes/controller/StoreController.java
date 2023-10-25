package com.example.easynotes.controller;


import com.example.easynotes.model.StoreDetails;
import com.example.easynotes.services.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/store")
public class StoreController {

    private final StoreService storeService;

    @Autowired
    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/list")
    public List<StoreDetails> getStoreList() {
        List<StoreDetails> stores = storeService.getStores();
        return stores;
    }
}

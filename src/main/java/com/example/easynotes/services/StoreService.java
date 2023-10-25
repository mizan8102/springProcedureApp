package com.example.easynotes.services;

import com.example.easynotes.model.StoreDetails;
import com.example.easynotes.repository.StoreDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {
    private final StoreDetailsRepository storeDetailsRepository;

    @Autowired
    public StoreService(StoreDetailsRepository storeDetailsRepository) {
        this.storeDetailsRepository = storeDetailsRepository;
    }

    public List<StoreDetails> getStores() {
        return storeDetailsRepository.getStoreList();
    }
}

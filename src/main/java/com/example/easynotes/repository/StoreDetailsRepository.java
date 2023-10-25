package com.example.easynotes.repository;

import com.example.easynotes.model.StoreDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StoreDetailsRepository extends JpaRepository<StoreDetails, Long> {
    @Procedure(name = "getStoreList")
    List<StoreDetails> getStoreList();
}
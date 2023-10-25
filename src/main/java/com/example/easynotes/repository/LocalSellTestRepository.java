package com.example.easynotes.repository;

import com.example.easynotes.model.LocalSellTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocalSellTestRepository extends JpaRepository<LocalSellTest, Long> {
    @Query(value = "CALL trasSellDropdownHK()", nativeQuery = true)
    List<LocalSellTest> callTrasSellDropdownHK();
}
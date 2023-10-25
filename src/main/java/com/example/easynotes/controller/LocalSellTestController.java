package com.example.easynotes.controller;

import com.example.easynotes.model.LocalSellTest;
import com.example.easynotes.repository.LocalSellTestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class LocalSellTestController {
    private final LocalSellTestRepository localSellTestRepository;

    @Autowired
    public LocalSellTestController(LocalSellTestRepository localSellTestRepository) {
        this.localSellTestRepository = localSellTestRepository;
    }

    @GetMapping("/local-sell-test")
    public Map<String, List<LocalSellTest>> groupByType() {
        List<LocalSellTest> localSellTests = localSellTestRepository.callTrasSellDropdownHK();
        Map<String, List<LocalSellTest>> groupedByType = localSellTests.stream()
                .collect(Collectors.groupingBy(LocalSellTest::getType));

        return groupedByType;
    }
}

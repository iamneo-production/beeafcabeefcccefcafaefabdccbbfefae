package com.examly.springapp.controller;

import com.examly.springapp.model.Laptop;
import com.examly.springapp.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class LaptopController {

    private final ApiService apiService;

    @Autowired
    public LaptopController(ApiService apiService) {
        this.apiService = apiService;
    }

    @PostMapping("/")
    public boolean addLaptop(@RequestBody Laptop laptop) {
        return apiService.addLaptop(laptop);
    }

    @GetMapping("/{laptopId}")
    public Laptop getLaptopById(@PathVariable int laptopId) {
        return apiService.getLaptopById(laptopId);
    }

    @GetMapping("/")
    public List<Laptop> getAllLaptops() {
        return apiService.getAllLaptops();
    }
}

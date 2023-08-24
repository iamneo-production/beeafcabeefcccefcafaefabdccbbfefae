package com.examly.springapp.service;

import com.examly.springapp.model.Laptop;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ApiService {
    private final Map<Integer, Laptop> laptops;

    public ApiService() {
        laptops = new HashMap<>();
    }

    public boolean addLaptop(Laptop laptop) {
        if (laptops.containsKey(laptop.getLaptopId())) {
            return false;
        }

        laptops.put(laptop.getLaptopId(), laptop);
        return true;
    }

    public Laptop getLaptopById(int laptopId) {
        return laptops.get(laptopId);
    }

    public List<Laptop> getAllLaptops() {
        return new ArrayList<>(laptops.values());
    }
}

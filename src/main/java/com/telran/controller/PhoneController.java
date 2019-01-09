package com.telran.controller;

import com.telran.entity.Phone;
import com.telran.repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PhoneController {

    @Autowired
    private PhoneRepository phoneRepository;

    @PostMapping("/phones")
    public Phone save(@RequestBody Phone phone) {
        return phoneRepository.save(phone);
    }

    @GetMapping("/phones")
    public List<Phone> getAll() {
        return phoneRepository.findAll();
    }
}

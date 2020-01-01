package com.example.testing.Controller;

import com.example.testing.Model.Android;
import com.example.testing.Repository.AndroidRepository;
import com.example.testing.Service.AndroidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class AndroidController {
    @Autowired
    AndroidRepository androidRepository;
    @Autowired
    AndroidService androidService;

    @GetMapping("getAndroid")
    public List<Android>getAll()
    {
        return androidService.getAll();
    }

    @PostMapping("postAndroid")
    public void postData(@RequestBody Android android)
    {
        androidRepository.save(android);
    }
}

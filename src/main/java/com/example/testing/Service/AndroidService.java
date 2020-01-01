package com.example.testing.Service;

import com.example.testing.Model.Android;
import com.example.testing.Repository.AndroidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AndroidService {
    @Autowired
    AndroidRepository androidRepository;

    AndroidService(AndroidRepository androidRepository){
        this.androidRepository=androidRepository;
    }
    public List<Android> getAll(){
        return androidRepository.findAll();
    }
}

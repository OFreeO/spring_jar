package com.example.demo.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AAController {

    @Autowired
    AARepository aaRepository;

    @GetMapping(value = "aaselect")
    public String select(){
        List<AA> list = aaRepository.findAll();
        System.out.println(list);
        return list.toString();
    }

    @GetMapping(value = "aainsert")
    public String insert(){
        aaRepository.save(new AA(0L,11,"bbb"));
        return "aa insert";
    }

    @GetMapping(value = "aaupdate")
    public String update(){
        aaRepository.save(new AA(1L,22,"ccc"));
        return "aa update";
    }

    @GetMapping(value = "aadelete")
    public String delete(){
        aaRepository.delete(new AA(1L,11,"bbb"));
        return "aa delete";
    }

    @GetMapping(value = "aadeleteall")
    public String deleteAll(){
        aaRepository.deleteAll();
        return "aa deleteAll";
    }
}

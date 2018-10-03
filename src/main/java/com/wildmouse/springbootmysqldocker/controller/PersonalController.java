package com.wildmouse.springbootmysqldocker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wildmouse.springbootmysqldocker.entity.Personal;
import com.wildmouse.springbootmysqldocker.repository.PersonalRepository;

@RestController
public class PersonalController {

    @Autowired
    private PersonalRepository personalRepository;

    @RequestMapping(value = "/")
    public List<Personal> index() {
        List<Personal> personalList = personalRepository.findAll();
        return personalList;
    }
}

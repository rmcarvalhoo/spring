package com.ricardo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class Cadastro {

    @RequestMapping("hello")
    public String getHello() {
        log.info("cremildo");
        return "Ola";
    }

}

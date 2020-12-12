package com.grapefruit.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class MyController {

    @Autowired
    Yellow yellow;

    @Autowired
    Grapefruit grapefruit;

    @RequestMapping("/")
    public String goIndex(){
        return LocalDateTime.now(Clock.systemUTC()).format(DateTimeFormatter.BASIC_ISO_DATE);
    }
}

package com.udweb.app.insudomain;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping(value = "/home")
    public String hello(){
        return "helloo";
    }
}

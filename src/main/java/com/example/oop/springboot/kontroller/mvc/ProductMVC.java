package com.example.oop.springboot.kontroller.mvc;

import org.springframework.stereotype.Controller;

//MVC olabilmesi için; @controller yazmalıyız
@Controller
public class ProductMVC {
    public String mvc1(){
        return "Merhabalar";
    }

}

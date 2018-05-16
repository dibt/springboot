package com.di.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.util.Date;

/**
 * Created by bentengdi on 2018/3/13.
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello(Model model) throws Exception {
        model.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
        if(true){
            throw new Exception();
        }
        return "hello";
    }

}

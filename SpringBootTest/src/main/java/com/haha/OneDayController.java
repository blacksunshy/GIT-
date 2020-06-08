package com.haha;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OneDayController {

    @GetMapping("/haha")
    public  String hello(){

        return " (～￣▽￣)～";
    }
}

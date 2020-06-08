package com.haha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@EnableAutoConfiguration
@ComponentScan
public class Oneday {

    public static void main(String[] args) {


        SpringApplication.run(Oneday.class,args);
    }
}

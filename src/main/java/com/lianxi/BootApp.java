package com.lianxi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lianxi.Dao")
public class BootApp {

    public static void main(String[] args){
        SpringApplication.run(BootApp.class, args);
    }
}

package com.lut.teach;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lut.teach.mapper")
public class TeachApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeachApplication.class, args);
    }

}

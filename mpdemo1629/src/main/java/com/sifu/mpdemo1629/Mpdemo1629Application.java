package com.sifu.mpdemo1629;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sifu.mpdemo1629.mapper")
public class Mpdemo1629Application {

    public static void main(String[] args) {
        SpringApplication.run(Mpdemo1629Application.class, args);
    }

}

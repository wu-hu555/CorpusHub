package com.zyh.corpushub;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zyh.corpushub.mapper")

public class CorpusHubApplication {

    public static void main(String[] args) {
        SpringApplication.run(CorpusHubApplication.class, args);
    }

}

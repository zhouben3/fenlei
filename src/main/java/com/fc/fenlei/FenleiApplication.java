package com.fc.fenlei;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.fc.fenlei.mapper")
@EnableTransactionManagement
public class FenleiApplication {

    public static void main(String[] args) {
        SpringApplication.run(FenleiApplication.class, args);
    }

}

package com.zdk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author zdk
 */
@SpringBootApplication
@EnableTransactionManagement
public class FoodSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(FoodSpringbootApplication.class, args);
    }

}

package com.kodilla.kalkulator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KalkulatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(KalkulatorApplication.class, args);
        Calculator calc = new Calculator();
        calc.sum(4222.3, 2123.22);
        calc.subtract(4222.3, 2123.22);
    }

}

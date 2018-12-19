package org.pichlera.spring.testcalculator;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class CalculatorApplication implements CommandLineRunner {

    public static Calculator calculator = new Calculator();

    public static void main(String[] args) {
        SpringApplication.run(CalculatorApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("A Useless Calculator!");
        System.out.println("Pls type in the first number you want to add with b");

        int a = new Scanner(System.in).nextInt();

        System.out.println("Pls type in the second number you want to add with a");

        int b = new Scanner(System.in).nextInt();

        int sum = calculator.add(a,b);

        System.out.println("Result: " + sum);

    }
}


package org.pichlera.spring.testcalculator;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Calculator {

    private int sum;
    private Scanner scan;

    public Calculator() {

        this.sum = 0;
        this.scan = new Scanner(System.in);
    }

    public int add(int a, int b){
        setSum(a+b);
        return this.sum;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int input(){

        int value;
        while(true){
            try {
                value = Integer.valueOf(scan.nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println("Pls type a number (int)");
            }
        }
        return value;
    }
}

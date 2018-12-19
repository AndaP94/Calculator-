package org.pichlera.spring.testcalculator;

public class Calculator {

    private int sum;

    public Calculator() {

        this.sum = 0;
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
}

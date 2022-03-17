package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(sqrt());
    }
    public static UnaryOperator<Double> sqrt(){
        UnaryOperator unaryOperator = new UnaryOperator() {
            @Override
            public void unaryOperator() {
               double a = Math.sqrt(100);
                System.out.println(a);
            }
        };
        unaryOperator.unaryOperator();
        return unaryOperator;

    }
}

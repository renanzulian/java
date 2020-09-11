package com.renan.java4;

public class Flow {
    public static void main(String[] args) {
        System.out.println("Init main");
        methodOne();
        System.out.println("End main");
    }

    private static void methodOne() {
        System.out.println("Init methodOne");
        try {
            methodTwo();
        } catch (Exception ex) {
            System.out.println("The software cannot " + ex.getMessage());
            ex.printStackTrace();
        }
        System.out.println("End methodOne");
    }

    private static void methodTwo() {
        System.out.println("Init methodTwo");
        throw new ArithmeticException("it should stop");
//        System.out.println("End methodTwo");
    }
}

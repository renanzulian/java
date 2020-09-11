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
        for (int i = 1; i < 6; i++) {
            System.out.println(i);
            int var = i/0;
        }
        System.out.println("End methodTwo");
    }
}

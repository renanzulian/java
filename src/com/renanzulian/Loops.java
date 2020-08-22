package com.renanzulian;

public class Loops {

    public static void main(String[] args) {
        int counter = 1;
        while (counter <= 10) {
            System.out.println("While at " + counter++);
        }

        for (int i = 1; i <= counter; i++) {
            System.out.println("For at " + i);
        }
    }
}

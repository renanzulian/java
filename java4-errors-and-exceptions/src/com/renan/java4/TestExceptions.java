package com.renan.java4;

public class TestExceptions {
    public static void main(String[] args) {
        understandingUncheckedExceptions();
        understandingCheckedExceptions();
    }

    private static void understandingCheckedExceptions() {
        try {
            System.out.println("This try is necessary");
            getCheckedMethod();
        } catch (Exception ex) {
            System.out.println("Catching a checked error");
        }

    }

    private static void getCheckedMethod() throws CheckedException {
        throw new CheckedException();
    }

    private static void understandingUncheckedExceptions() {
        try {
            System.out.println("This try isn't necessary");
            getUncheckedMethod();
        } catch (Exception ex) {
            System.out.println("Catching an unchecked error");
        }
    }

    private static void getUncheckedMethod() {
        throw new UncheckedException();
    }

}

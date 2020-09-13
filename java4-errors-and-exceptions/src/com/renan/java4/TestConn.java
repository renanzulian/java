package com.renan.java4;

public class TestConn {
    public static void main(String[] args) {
        tryCatchSimple();
        tryCatchWIthParameter();
    }

    private static void tryCatchWIthParameter() {
        try (Connection conn = new Connection()) {
            conn.getData();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getCause());
        }
    }

    private static void tryCatchSimple() {
        Connection conn = null;
        try {
            conn = new Connection();
            conn.getData();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        } finally {
            conn.close();
        }
    }
}

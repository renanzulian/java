package com.renan.java4;

public class Connection implements AutoCloseable {

    public Connection() {
        System.out.println("Connection starting");
    }

    public void getData() {
        System.out.println("Getting data");
        throw new IllegalStateException();
    }

    public void close() {
        System.out.println("Connection closing");
    }
}

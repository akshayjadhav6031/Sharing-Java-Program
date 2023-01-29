package com.multithreading;

public class Multi1 implements Runnable {
    @Override
    public void run() {
        System.out.println("Tread creation by implementing the runnable interface");
    }

    public static void main(String[] args) {
        Multi1 n = new Multi1();
        Thread o = new Thread(n);
        o.start();
        n.run();
    }
}

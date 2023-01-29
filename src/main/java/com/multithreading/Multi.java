package com.multithreading;

public class Multi extends Thread {
    public void run(){
        System.out.println("Thread creation by extending the thread class");
    }

    public static void main(String[] args) {
        Multi m = new Multi();
        m.run();
       m.start();
    }
}

package com.javarush.test.level25.lesson07.home01;

public class TaskManipulator implements Runnable, CustomThreadManipulator {
    private Thread thread;

    public void run() {
        while (!thread.isInterrupted()) {
            try {
                Thread.sleep(0);
                System.out.println(thread.getName());
                Thread.sleep(90);
            } catch (InterruptedException e) {
                break;
            }
        }
    }

    public void start(String threadName) {
        thread = new Thread(this, threadName);
        thread.start();
    }

    public void stop() {
        thread.interrupt();
    }
}

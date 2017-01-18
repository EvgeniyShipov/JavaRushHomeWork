package com.javarush.test.level24.lesson02.home01;

public class SelfInterfaceMarkerImpl implements SelfInterfaceMarker {
    private int x;
    private boolean isStop;

    public SelfInterfaceMarkerImpl() {
        x = 0;
        isStop = false;
    }

    public void go() {
        for (int i = 0; i < 100; i++) {
            if (!isStop) {
                x++;
            }
        }
    }

    public void stop() {
        isStop = true;
    }
}

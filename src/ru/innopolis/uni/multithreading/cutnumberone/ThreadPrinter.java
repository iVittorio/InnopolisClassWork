package ru.innopolis.uni.multithreading.cutnumberone;

import java.util.Map;

/**
 * Created by i.viktor on 08/11/2016.
 */
public class ThreadPrinter extends Thread {
    private final Map<Integer, Integer> sharedMap;
    private boolean interruptMarker;
    private int notifyCounter;

    public ThreadPrinter(Map<Integer, Integer> sharedMap, boolean interruptMarker, int notifyCounter) {
        this.sharedMap = sharedMap;
        this.interruptMarker = interruptMarker;
        this.notifyCounter = notifyCounter;
    }

    @Override
    public void run() {
        while (!interruptMarker) {
            synchronized (sharedMap) {
                try {
                    sharedMap.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if (notifyCounter % 5 == 0) {
                    printMap(sharedMap);
                }
            }
        }
    }

    public void printMap(Map<Integer, Integer> map) {
        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            int key = pair.getKey();
            int value = pair.getValue();
            System.out.println(key + " - " + value);
            if (value == 5) interruptMarker = true;
        }
    }
}

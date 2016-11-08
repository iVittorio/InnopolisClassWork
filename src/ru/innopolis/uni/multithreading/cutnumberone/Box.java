package ru.innopolis.uni.multithreading.cutnumberone;

import java.util.Map;

/**
 * Created by i.viktor on 08/11/2016.
 */
public class Box {
    private final Map<Integer, Integer> map;
    private volatile boolean marker;
    private volatile int notifyCounter;


    public Box(Map<Integer, Integer> map) {
        this.map = map;
    }

    public Map<Integer, Integer> getMap() {
        return map;
    }

    public boolean isMarker() {
        return marker;
    }

    public int getNotifyCounter() {
        return notifyCounter;
    }

    public void setMarker(boolean marker) {
        this.marker = marker;
    }

    public void setNotifyCounter(int notifyCounter) {
        this.notifyCounter = notifyCounter;
    }
}

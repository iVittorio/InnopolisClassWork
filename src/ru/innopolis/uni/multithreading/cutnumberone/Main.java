package ru.innopolis.uni.multithreading.cutnumberone;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by i.viktor on 08/11/2016.
 */
public class Main {
    public static final Map<Integer, Integer> sharedMap = new HashMap<>();
    public volatile static boolean interruptMarker;
    public volatile static int notifyCount = 1;

    public static void main(String[] args) throws InterruptedException {


        Box box = new Box(sharedMap);

        Thread generator = new ThreadGenerator(sharedMap, notifyCount);
        Thread print = new ThreadPrinter(sharedMap, interruptMarker, notifyCount);

        generator.start();
        print.start();



//        generator.interrupt();
    }

}

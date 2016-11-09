package ru.innopolis.uni.iostream;

import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by i.viktor on 02/11/2016.
 */
public class CloseUtils {

    public static void close(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

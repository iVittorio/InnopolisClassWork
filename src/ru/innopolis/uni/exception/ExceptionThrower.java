package ru.innopolis.uni.exception;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * Created by i.viktor on 02/11/2016.
 */
public class ExceptionThrower {
    public String throwEx() throws IOException {
        throw new IOException();
    }
}

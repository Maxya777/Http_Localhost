package ru.netology;

import java.io.BufferedOutputStream;

public interface Handler {

    String handle(Request request, BufferedOutputStream responseStream);
}

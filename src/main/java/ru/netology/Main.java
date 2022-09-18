package ru.netology;

import java.io.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
  public static void main(String[] args) throws IOException {

    ExecutorService es = Executors.newFixedThreadPool(64);

    es.submit(new Server(9999));
    es.shutdown();
  }
}



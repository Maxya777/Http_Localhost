package ru.netology;

import java.io.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
  public static void main(String[] args){
    final var server = new Server();
    // код инициализации сервера (из вашего предыдущего ДЗ)

    // добавление handler'ов (обработчиков)
    server.addHandler("GET", "/messages", new Handler() {
      public void handle(Request request, BufferedOutputStream responseStream) {
        // TODO: handlers code
      }
    });
    server.addHandler("POST", "/messages", new Handler() {
      public void handle(Request request, BufferedOutputStream responseStream) {
        // TODO: handlers code
      }
    });

    server.listen(9999);
  }
}



package ru.netology;

public class Request {

    protected final String GET = "GET";
    protected final String POST = "POST";
    private final String message;
    private final static String DELIMITER = "\r\n\r\n";

    public Request(String message) {
        this.message = message;
    }
}

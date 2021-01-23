package org.nicetools.net.client;

import java.util.LinkedList;
import java.util.Queue;

public class BufferedSender<T> {
    private String host;
    private int port;
    private Queue<T> queue = new LinkedList<T>();

    public String getHost() {
        return host;
    }

    public BufferedSender<T> setHost(String host) {
        this.host = host;
        return this;
    }

    public int getPort() {
        return port;
    }

    public BufferedSender<T> setPort(int port) {
        this.port = port;
        return this;
    }

    public Queue<T> getQueue() {
        return queue;
    }

    public BufferedSender<T> setQueue(LinkedList<T> queue) {
        this.queue = queue;
        return this;
    }

    public BufferedSender(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public BufferedSender() {
    }

    public void send(T data){
        queue.add(data);
    }

}

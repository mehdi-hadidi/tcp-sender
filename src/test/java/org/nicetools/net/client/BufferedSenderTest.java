package org.nicetools.net.client;

import org.junit.Assert;
import org.junit.Test;

public class BufferedSenderTest {

    @Test
    public void testHostPortIsSet(){
        String host = "myhostname";
        int port = 8000;
        BufferedSender sender = new BufferedSender(host,port);
        Assert.assertEquals("Host is not set correctly",host,sender.getHost());
        Assert.assertEquals("Port is not set correctly",port,sender.getPort());
    }

    @Test
    public void testDataIsBufferedUnchanged(){
        BufferedSender sender = new BufferedSender();
        String data = "test data";
        sender.send(data);
        Assert.assertEquals("Buffered data not found",data,sender.getQueue().remove());
    }

    @Test
    public void testDataIsBufferedCorrectly(){
        BufferedSender sender = new BufferedSender();
        String data = "test data";
        int size = 10;
        for (int i = 0; i < size; i++) {
            sender.send(data);
        }
        Assert.assertEquals("Buffer size is not correct",size,sender.getQueue().size());
    }

}

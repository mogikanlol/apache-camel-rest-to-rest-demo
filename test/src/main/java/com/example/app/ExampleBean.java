package com.example.app;

import org.apache.camel.Message;

public class ExampleBean {

    public void methodName(Message message) {
        System.out.println("In ExampleBean:methodName");
        System.out.println("Message = " + message);
    }

}

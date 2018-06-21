package com.imie.stock.connectors;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    @RabbitListener(queues = "produits-in")
    public void receiveMessageIn(final Message message) {
        System.out.println("Received message as generic: " +  new String (message.getBody()));
    }

    @RabbitListener(queues = "produits-out")
    public void receiveMessageOut(final Message message) {
        System.out.println("Received message as generic: " +  new String (message.getBody()));
    }
}
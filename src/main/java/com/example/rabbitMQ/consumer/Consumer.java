package com.example.rabbitMQ.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
    @RabbitListener(queues = {"${com.example.rabbitmq.name}"})
    public void receive(@Payload String message){
        System.out.println(message);
        // HACER LO QUE NECESITEN CON LA INFORMACIÓN
    }
}

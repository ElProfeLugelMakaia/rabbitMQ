package com.example.rabbitMQ.publisher;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@EnableRabbit
public class Publisher {
    private RabbitTemplate rabbitTemplate;
    private Queue queue;

    @Autowired
    public Publisher(RabbitTemplate rabbitTemplate, Queue queue) {
        this.rabbitTemplate = rabbitTemplate;
        this.queue = queue;
    }

    public String send(String message){
        this.rabbitTemplate.convertAndSend(this.queue.getName(), message);
        return "¡Enviado con éxito!";
    }
}


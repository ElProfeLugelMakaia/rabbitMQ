package com.example.rabbitMQ.publisher;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PublisherConfig {

    @Value("${com.example.rabbitmq.name}")
    private String name;

    @Bean
    public Queue queue(){
        return  new Queue(name, true);
    }
}

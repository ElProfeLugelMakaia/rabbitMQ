package com.example.rabbitMQ.controllers;

import com.example.rabbitMQ.publisher.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/message")
public class MessageController {
    private Publisher publisher;

    @Autowired
    public MessageController(Publisher publisher) {
        this.publisher = publisher;
    }

    @GetMapping()
    public String sendMessage(@RequestParam("message") String message){
        // localhost:8080/api/v1/message?message=HolaAmigo
        return publisher.send(message);
    }
}

package com.example.notificationserviceapplication.controller;

import com.example.notificationserviceapplication.models.Notifications;
import com.example.notificationserviceapplication.repositories.NotificationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    NotificationsRepository notificationsRepository ;

    @PostMapping("/api/send/notification")
    public Notifications postNotification(@RequestBody Notifications notifications){
        System.out.println("i am hit");
        return notificationsRepository.save(notifications);

    }
    @GetMapping("/api/receive/notification")
    public List<Notifications> getNotifications(){
        System.out.println("i am hit ");
        return notificationsRepository.findAll();

    }



}

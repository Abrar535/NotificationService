package com.example.notificationserviceapplication.services;

import com.example.notificationserviceapplication.dao.EmailNotifications;
import com.example.notificationserviceapplication.models.Notifications;
import com.example.notificationserviceapplication.repositories.NotificationsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EmailNotificationService {
    @Autowired
    NotificationsRepository notificationsRepository;
    private final Integer emailNotificationsType = 2;
    @RabbitListener(queues = "${emailintegrationmessage}")
    public void handleEmailNotification( EmailNotifications emailNotifications){

        log.info("Sending E-mail to "+emailNotifications.getToEmail()+", EmailText: "+emailNotifications.getEmailText());
        Notifications notifications = new Notifications(emailNotificationsType,emailNotifications.getUserIdentityGuid(),emailNotifications.getToEmail(),emailNotifications.getEmailText());
        save(notifications);
    }
    public Notifications save(Notifications notifications){
        return notificationsRepository.save(notifications);
    }




}

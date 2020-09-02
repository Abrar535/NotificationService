package com.example.notificationserviceapplication.services;

import com.example.notificationserviceapplication.dao.SmsNotifications;
import com.example.notificationserviceapplication.models.Notifications;
import com.example.notificationserviceapplication.repositories.NotificationsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class SmsNotificationService {
    @Autowired
    NotificationsRepository notificationsRepository;
    private final Integer smsNotificationsType = 1;
    @RabbitListener(queues = "${smsintegrationmessage}")
    public void handleSmsNotification(SmsNotifications smsNotifications){

        log.info("Sending sms to "+smsNotifications.getDestinationPhoneNumber()+", SmsText: "+smsNotifications.getSmsText());
        Notifications notifications = new Notifications(smsNotificationsType,smsNotifications.getUserIdentityGuid(),smsNotifications.getDestinationPhoneNumber(),smsNotifications.getSmsText());
        save(notifications);
    }

    public Notifications save(Notifications notifications){
        return notificationsRepository.save(notifications);
    }




}

package com.example.notificationserviceapplication.services;

import com.example.notificationserviceapplication.dao.EmailNotifications;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EmailNotificationService {

    @RabbitListener(queues = "${emailintegrationmessage}")
    public void handleEmailNotification( EmailNotifications emailNotifications){

        log.info("E-MAIL Received -> "+emailNotifications.toString());
        log.info("Sending E-mail to "+emailNotifications.getToEmail()+", EmailText: "+emailNotifications.getEmailText());
    }




}

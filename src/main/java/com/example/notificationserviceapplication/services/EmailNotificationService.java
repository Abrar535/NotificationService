package com.example.notificationserviceapplication.services;

import com.example.notificationserviceapplication.dao.EmailNotifications;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EmailNotificationService {

    @RabbitListener(queues = "${emailintegrationmessage}")
    public void handleSms(EmailNotifications emailNotifications){

        log.info("E-MAIL Received -> "+emailNotifications);

    }

}

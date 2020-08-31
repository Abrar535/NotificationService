package com.example.notificationserviceapplication.services;

import com.example.notificationserviceapplication.dao.SmsNotifications;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class SmsNotificationService {

    @RabbitListener(queues = "${smsintegrationmessage}")
    public void handleSms(SmsNotifications smsNotifications){

        log.info("SMS Received -> "+smsNotifications);

    }





}

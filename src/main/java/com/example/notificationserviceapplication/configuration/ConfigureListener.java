package com.example.notificationserviceapplication.configuration;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigureListener {
    @Bean
    public MessageConverter jsonMessageConverter(){
        return new Jackson2JsonMessageConverter();
    }
    @Bean
    public SimpleRabbitListenerContainerFactory simpleRabbitListenerContainerFactory(){
       final var simpleRabbitListenerContainerFactory = new SimpleRabbitListenerContainerFactory();
       simpleRabbitListenerContainerFactory.setMessageConverter(jsonMessageConverter());
       return simpleRabbitListenerContainerFactory;
    }

}

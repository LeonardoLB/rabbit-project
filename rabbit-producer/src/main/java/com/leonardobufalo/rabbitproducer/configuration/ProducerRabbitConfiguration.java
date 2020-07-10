package com.leonardobufalo.rabbitproducer.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProducerRabbitConfiguration {

    @Value("${spring.rabbitmq.routing-key.producer}")
    private String queue;

    private String exchange;

    private String deadletter;
}

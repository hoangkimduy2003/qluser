package com.qluser.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumers {

    private static final Logger log = LoggerFactory.getLogger(Consumers.class);

    @KafkaListener(topics = "CATALOG_EVENT_ACTION_AUDIT")
    public void listenToTopic(String recmessage) {
        log.info(recmessage);
    }
}

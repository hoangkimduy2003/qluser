package com.qluser.service;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producers {

    private static final Logger log = LoggerFactory.getLogger(Producers.class);

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMsgToTopic(String message) {
        log.info("Sending message");
        kafkaTemplate.send("CATALOG_EVENT_ACTION_AUDIT", message);
    }
}

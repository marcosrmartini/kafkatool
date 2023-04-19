package com.telefonica.kafkatool.listenner;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import lombok.extern.java.Log;


@Log
@Service
public class listenGroupEvent {
	
	@KafkaListener(topics = "events", groupId = "kafkatool-group")
	public void listenGroupFoo(String message) {
	    log.info("Received Message in group kafkatool-group: " + message);
	}
	
	


	
}

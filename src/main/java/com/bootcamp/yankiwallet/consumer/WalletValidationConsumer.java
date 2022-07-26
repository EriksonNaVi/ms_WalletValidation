package com.bootcamp.yankiwallet.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.bootcamp.yankiwallet.events.AccountWalletCreateEvent;
import com.bootcamp.yankiwallet.events.Event;

@Component
public class WalletValidationConsumer {

  private static final Logger LOGGER = LoggerFactory.getLogger(WalletValidationConsumer.class);

  @KafkaListener(topics = "${topic.wallet.name:validation}", containerFactory = "kafkaListenerContainerFactory", groupId = "grupo1")
  public void consumer(Event<?> event) {
    if (event.getClass().isAssignableFrom(AccountWalletCreateEvent.class)) {
      AccountWalletCreateEvent accountWalletCreateEvent = (AccountWalletCreateEvent) event;
      LOGGER.info("The consumer receives the customer with Id={}, data={}", accountWalletCreateEvent.getId(),
          accountWalletCreateEvent.getData().toString());
    }
  }
}
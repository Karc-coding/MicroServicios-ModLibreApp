package com.libreapp.nttdata.producto.kafka.producer;

import com.libreapp.nttdata.openfeign.notificacionkafka.NotificacionKafkaRequest;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ProductoProducer {
    private NewTopic topic;
    private KafkaTemplate<String, NotificacionKafkaRequest> kafkaTemplate;

    public ProductoProducer(NewTopic topic, KafkaTemplate<String, NotificacionKafkaRequest> kafkaTemplate) {
        this.topic = topic;
        this.kafkaTemplate = kafkaTemplate;
    }

    public void enviarMensaje(NotificacionKafkaRequest notificacionKafkaRequest){
        log.info("Notificación Kafka producer: {}", notificacionKafkaRequest);

        Message<NotificacionKafkaRequest> message = MessageBuilder
                .withPayload(notificacionKafkaRequest)
                .setHeader(KafkaHeaders.TOPIC, topic.name())
                .build();

        kafkaTemplate.send(message);
    }
}

package com.libreapp.nttdata.kafka.consumer;

import com.libreapp.nttdata.kafka.service.NotificacionService;
import com.libreapp.nttdata.openfeign.notificacionkafka.NotificacionKafkaRequest;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class NotificacionKafkaConsumer {
    private final NotificacionService notificacionService;

    @KafkaListener(
            topics = "${spring.kafka.topic.name}",
            groupId = "${spring.kafka.consumer.group-id}"
    )
    private void consumer(NotificacionKafkaRequest notificacionKafkaRequest){
        log.info("Notificación Kafka consumer: {}", notificacionKafkaRequest);
        notificacionService.enviarConfirmacionRegistro(notificacionKafkaRequest);
    }
}

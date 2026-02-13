package com.example.kafkarestapi.service;

import com.example.kafkarestapi.model.KafkaMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
@Slf4j
public class KafkaProducerService {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public CompletableFuture<SendResult<String, Object>> sendMessage(KafkaMessage kafkaMessage) {
        String topic = kafkaMessage.getTopic();
        String key = kafkaMessage.getKey();
        Object message = kafkaMessage.getMessage();

        CompletableFuture<SendResult<String, Object>> future = kafkaTemplate.send(topic, key, message);

        future.whenComplete((result, ex) -> {
            if (ex == null) {
                log.info("Mensagem enviada com sucesso para o tópico: {}, partição: {}, offset: {}",
                        topic, result.getRecordMetadata().partition(), result.getRecordMetadata().offset());
            } else {
                log.error("Erro ao enviar mensagem para o tópico: {}", topic, ex);
            }
        });

        return future;
    }
}

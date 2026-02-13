package com.example.kafkarestapi.controller;

import com.example.kafkarestapi.model.KafkaMessage;
import com.example.kafkarestapi.service.KafkaProducerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
@Slf4j
public class KafkaProducerController {

    @Autowired
    private KafkaProducerService kafkaProducerService;

    /**
        POST /api/v1/send
        Content-Type: application/json
        {
         "topic": "nome-da-sua-fila",
         "message": "seu-mensagem-aqui",
         "key": "chave-opcional"
         }
     * @param kafkaMessage
     * @return
     */
    @PostMapping("/send")
    public ResponseEntity<Map<String, String>> sendMessage(@Valid @RequestBody KafkaMessage kafkaMessage) {
        log.info("Recebendo requisição para enviar mensagem para o tópico: {}", kafkaMessage.getTopic());

        try {
            // Aguarda a confirmação do Kafka. O método .get() é bloqueante.
            kafkaProducerService.sendMessage(kafkaMessage).get();

            return ResponseEntity.ok(Map.of(
                "status", "success",
                "message", "Mensagem enviada com sucesso para o tópico: " + kafkaMessage.getTopic()
            ));
        } catch (Exception e) {
            log.error("Erro ao enviar mensagem para o Kafka", e);
            // A exceção do futuro é encapsulada em ExecutionException
            Throwable cause = e.getCause() != null ? e.getCause() : e;
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(Map.of(
                    "status", "error",
                    "message", "Erro ao enviar mensagem: " + cause.getMessage()
                ));
        }
    }

    @GetMapping("/health")
    public ResponseEntity<Map<String, String>> healthCheck() {
        return ResponseEntity.ok(Map.of(
            "status", "UP",
            "service", "kafka-rest-api"
        ));
    }
}

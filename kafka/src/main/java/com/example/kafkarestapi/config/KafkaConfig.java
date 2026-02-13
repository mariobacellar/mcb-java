package com.example.kafkarestapi.config;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaConfig {

    @Value("${spring.kafka.bootstrap-servers:localhost:9092}")
    private String bootstrapServers;

    @Bean
    public ProducerFactory<String, Object> producerFactory() {
        Map<String, Object> 
        configProps = new HashMap<>();
        configProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
        configProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);

        // --- Configurações de Confiabilidade e Retry ---

        // Habilita o producer idempotente para evitar duplicatas.
        // Isso implica acks=all, retries=Integer.MAX_VALUE e max.in.flight.requests.per.connection=5
        configProps.put(ProducerConfig.ENABLE_IDEMPOTENCE_CONFIG, true);

        // Timeout total para a entrega da mensagem, incluindo retentativas.
        // Se este tempo for excedido, a operação falha. (Ex: 60 segundos)
        configProps.put(ProducerConfig.DELIVERY_TIMEOUT_MS_CONFIG, 60000);

        // Tempo de espera entre as retentativas para não sobrecarregar o broker. (Ex: 200ms)
        configProps.put(ProducerConfig.RETRY_BACKOFF_MS_CONFIG, 200);

        return new DefaultKafkaProducerFactory<>(configProps);
    }

    @Bean
    public KafkaTemplate<String, Object> kafkaTemplate() {
        return new KafkaTemplate<>(producerFactory());
    }
}

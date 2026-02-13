package com.example.kafkarestapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class KafkaMessage {
    
    @NotBlank(message = "O tópico não pode estar vazio")
    @JsonProperty("topic")
    private String topic;
    
    @NotNull(message = "A mensagem não pode ser nula")
    @JsonProperty("message")
    private Object message;
    
    @JsonProperty("key")
    private String key;
}

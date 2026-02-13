package com.mcb.ecommerce.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CartaoCredito {
    @JsonProperty("id")
    private String id;

    @JsonProperty("numero")
    private String numero;

    @JsonProperty("nomeTitular")
    private String nomeTitular;

    @JsonProperty("dataValidade")
    private String dataValidade;

    @JsonProperty("codigoSeguranca")
    private String codigoSeguranca;

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getCodigoSeguranca() {
        return codigoSeguranca;
    }

    public void setCodigoSeguranca(String codigoSeguranca) {
        this.codigoSeguranca = codigoSeguranca;
    }
}

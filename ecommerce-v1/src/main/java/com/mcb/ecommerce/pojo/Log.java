package com.mcb.ecommerce.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Log {
    @JsonProperty("id")
    private String id;

    @JsonProperty("tipo")
    private String tipo;

    @JsonProperty("acao")
    private String acao;

    @JsonProperty("entidade")
    private String entidade;

    @JsonProperty("entidadeId")
    private String entidadeId;

    @JsonProperty("usuarioId")
    private String usuarioId;

    @JsonProperty("ip")
    private String ip;

    @JsonProperty("userAgent")
    private String userAgent;

    @JsonProperty("dataHora")
    private String dataHora;

    @JsonProperty("dados")
    private Object dados;

    @JsonProperty("detalhes")
    private String detalhes;

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public String getEntidade() {
        return entidade;
    }

    public void setEntidade(String entidade) {
        this.entidade = entidade;
    }

    public String getEntidadeId() {
        return entidadeId;
    }

    public void setEntidadeId(String entidadeId) {
        this.entidadeId = entidadeId;
    }

    public String getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(String usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public Object getDados() {
        return dados;
    }

    public void setDados(Object dados) {
        this.dados = dados;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }
}

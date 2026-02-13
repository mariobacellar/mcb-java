package com.mcb.ecommerce.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Avaliacao {
    @JsonProperty("id")
    private String id;

    @JsonProperty("produtoId")
    private String produtoId;

    @JsonProperty("nota")
    private int nota;

    @JsonProperty("comentario")
    private String comentario;

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(String produtoId) {
        this.produtoId = produtoId;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}

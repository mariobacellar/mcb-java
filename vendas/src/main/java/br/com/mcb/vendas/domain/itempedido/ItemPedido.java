package br.com.mcb.vendas.domain.itempedido;

import jakarta.persistence.*;

// Entidade ItemPedido
@Entity
@Table(name = "itens_pedido")
public class ItemPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long pedidoId;
    private String descricao;
    private int quantidade;
    private double precoUnitario;
    
    public Long getId() {
        return id;
    }
    public Long getPedidoId() {
        return pedidoId;
    }
    public String getDescricao() {
        return descricao;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public double getPrecoUnitario() {
        return precoUnitario;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setPedidoId(Long pedidoId) {
        this.pedidoId = pedidoId;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }



}


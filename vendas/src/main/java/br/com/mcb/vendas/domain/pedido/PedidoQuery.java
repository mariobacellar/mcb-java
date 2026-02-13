package br.com.mcb.vendas.domain.pedido;

// Entidade Pedido para MongoDB (Leitura)
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Document(collection = "pedidos")
public class PedidoQuery {
    @Id
    private String id;
    private Long pedidoId;
    private Long clienteId;
    private int totalItens;
    private double valorTotal;
    private LocalDate dataPedido;
    private List<ItemPedido> itens;
    public String getId() {
        return id;
    }
    public Long getPedidoId() {
        return pedidoId;
    }
    public Long getClienteId() {
        return clienteId;
    }
    public int getTotalItens() {
        return totalItens;
    }
    public double getValorTotal() {
        return valorTotal;
    }
    public LocalDate getDataPedido() {
        return dataPedido;
    }
    public List<ItemPedido> getItens() {
        return itens;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setPedidoId(Long pedidoId) {
        this.pedidoId = pedidoId;
    }
    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }
    public void setTotalItens(int totalItens) {
        this.totalItens = totalItens;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    public void setDataPedido(LocalDate dataPedido) {
        this.dataPedido = dataPedido;
    }
    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }
    
 



}





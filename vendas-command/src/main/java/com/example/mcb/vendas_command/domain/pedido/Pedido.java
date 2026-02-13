package br.com.mcb.vendas.domain.pedido;

// Entidade Pedido (para PostgreSQL)
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "pedidos")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long clienteId;
    private int totalItens;
    private double valorTotal;
    private LocalDate dataPedido;
    public void setId(Long id) {
        this.id = id;
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
    public Long getId() {
        return id;
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
    
 
    
}

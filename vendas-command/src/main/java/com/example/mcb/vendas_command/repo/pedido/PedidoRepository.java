package br.com.mcb.vendas.repo.pedido;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.mcb.vendas.domain.pedido.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {}

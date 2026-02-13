package br.com.mcb.vendas.repo.itempedido;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.mcb.vendas.domain.itempedido.ItemPedido;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Long> {}


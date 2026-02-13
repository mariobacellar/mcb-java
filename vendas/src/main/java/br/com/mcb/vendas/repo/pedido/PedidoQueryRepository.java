package br.com.mcb.vendas.repo.pedido;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.mcb.vendas.domain.pedido.PedidoQuery;

public interface PedidoQueryRepository extends MongoRepository<PedidoQuery, String> {}

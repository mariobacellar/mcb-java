package br.com.mcb.vendas.repo.cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.mcb.vendas.domain.cliente.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {}

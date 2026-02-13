package br.com.mcb.vendas.service.cliente;

// Serviço de Cliente
import org.springframework.stereotype.Service;

import br.com.mcb.vendas.domain.cliente.Cliente;
import br.com.mcb.vendas.repo.cliente.ClienteRepository;

import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente salvarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }
}

package com.barbearia.barbeariaapi.service;

import com.barbearia.barbeariaapi.entity.Cliente;
import com.barbearia.barbeariaapi.repository.ClienteRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@Service
public class ClienteService {

    private final ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public Cliente criar(Cliente cliente) {
        return repository.save(cliente);
    }

    public List<Cliente> listar() {
        return repository.findAll();
    }

    public Cliente buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(NOT_FOUND, "Cliente não encontrado"));
    }

    public Cliente atualizar(Long id, Cliente dados) {
        Cliente existente = buscarPorId(id);

        existente.setNome(dados.getNome());
        existente.setEndereco(dados.getEndereco());
        existente.setTelefonePrincipal(dados.getTelefonePrincipal());
        existente.setTelefoneSecundario(dados.getTelefoneSecundario());

        return repository.save(existente);
    }

    public void deletar(Long id) {
        Cliente existente = buscarPorId(id);
        repository.delete(existente);
    }
}
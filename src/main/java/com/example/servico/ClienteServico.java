package com.example.servico;

import com.example.dominio.Cliente;
import com.example.repositorio.ClienteRepositosro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServico {
    @Autowired
    private ClienteRepositosro repositosro;

    public Cliente criaraCliente(Cliente cliente){
        return repositosro.save(cliente);
    }
    public List<Cliente> buscarClientes(){
        return  repositosro.findAll();
    }
    public Cliente buscarPorId(Long id){
        return repositosro.findById(id).get();

    }
}

package com.example.controle;

import com.example.dominio.Cliente;
import com.example.servico.ClienteServico;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.html.HTMLTableCaptionElement;

import java.util.List;

@RestController
@RequestMapping("cliente")
public class ClienteControle {

    @Autowired
    private ClienteServico servivo;

    @PostMapping
    public ResponseEntity<Cliente> criaraCliente(@RequestBody Cliente cliente) {
        var criar = servivo.criaraCliente(cliente);
        return new ResponseEntity<>(criar, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Cliente>>buscarClientes(){
        var busca = servivo.buscarClientes();
        return new ResponseEntity<>(busca, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Cliente>buscarPorId(@PathVariable Long id){
        var buscar = servivo.buscarPorId(id);
        return new ResponseEntity<>(buscar,HttpStatus.OK);
    }
}
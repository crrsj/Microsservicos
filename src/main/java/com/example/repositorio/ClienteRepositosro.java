package com.example.repositorio;

import com.example.dominio.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepositosro extends JpaRepository<Cliente,Long> {
}

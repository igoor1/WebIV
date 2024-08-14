package com.example.demo.Controller;

import com.example.demo.Model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ClienteController {
    @GetMapping("cliente")
    public Cliente getCliente(){
        Cliente cliente = new Cliente(1, "Jose", "Av. Paulista");
        return cliente;
    }

    @GetMapping("clientes")
    public List<Cliente> getAll(){
        List<Cliente> lista = new ArrayList<>();
        lista.add(new Cliente(1, "Jose", "Av Paulista"));
        lista.add(new Cliente(2, "Silva", "Av Radial"));
        lista.add(new Cliente(3, "Maria", "Av Martins Fontes"));
        return lista;
    }
}

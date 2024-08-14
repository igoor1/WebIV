package com.example.demo.Controller;

import com.example.demo.Model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {
    @GetMapping("cliente")
    public Cliente getCliente(){
        Cliente cliente = new Cliente(1, "Jose", "Av. Paulista");
        return cliente;
    }
}

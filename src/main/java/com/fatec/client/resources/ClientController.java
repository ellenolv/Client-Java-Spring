package com.fatec.client.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.client.entities.Client;

@RestController // permite a classe gerar um end-point
public class ClientController { //a partir de uma classe, fazemos os metódos e objetos
    @GetMapping("Client")
    public  Client  getClient(){  
        Client c = new Client(); //constroe um objeto

        //defino e populo os dados do cliente
        c.setId(1);
        c.setEmail("joao@gmail.com");
        c.setName("João Silva");

        return c;

    }

    @GetMapping("Clients")
    public String getClients(){  
        return "id: 1, nome: Maria, email: maria@gmail.com" +
        "id: 2, nome: Jose, email: Jose@gmail.com ";

    }
}

package com.gustv.service;

import com.gustv.model.Cliente;
import com.gustv.respository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {

    private ClientesRepository repository;
    // injetar a intancia do repository no service (INJEÇÃO DE DEPENDENCIAS)
    @Autowired // annotation para informa ao spring que deve injetar essa instancia!
    public ClientesService(ClientesRepository repository){
        this.repository = repository;
    }

    public void salvarCliente(Cliente cliente){
        validaCliente(cliente);
        //ClientesRepository clientesRepository = new ClientesRepository(); nao é recomendo fazer pois é um obj que acessa a base de dados
        // e por isso pode tornar a aplicação mto pesada se ficar instaciando toda vez um novo obj!
        this.repository.persistir(cliente);

    }

    public void validaCliente(Cliente cliente){


    }
}

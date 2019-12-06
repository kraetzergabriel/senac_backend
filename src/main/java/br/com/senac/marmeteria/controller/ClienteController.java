package br.com.senac.marmeteria.controller;

import br.com.senac.marmeteria.domain.Cliente;
import br.com.senac.marmeteria.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/cliente")
public class ClienteController {


    @Autowired
    private ClienteRepository repository;

    @PostMapping
    public void salvar(@RequestBody @Valid Cliente cliente){
        repository.save(cliente);
    }

    @GetMapping
    public List<Cliente> categorias(){
        return repository.findAll();
    }
}

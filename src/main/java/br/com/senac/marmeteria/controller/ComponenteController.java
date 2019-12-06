package br.com.senac.marmeteria.controller;

import br.com.senac.marmeteria.domain.Componente;
import br.com.senac.marmeteria.repository.ComponenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/componente")
public class ComponenteController {

    @Autowired
    private ComponenteRepository repository;

    @PostMapping
    public void salvar(@RequestBody @Valid Componente componente){
        repository.save(componente);
    }

    @GetMapping
    public List<Componente> categorias(){
        return repository.findAll();
    }
}

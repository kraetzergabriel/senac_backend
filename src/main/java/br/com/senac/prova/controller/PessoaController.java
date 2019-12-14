package br.com.senac.prova.controller;

import br.com.senac.prova.domain.Pessoa;
import br.com.senac.prova.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private PessoaRepository repository;

    @PostMapping
    public Pessoa salvar(@RequestBody @Valid Pessoa pessoa){
        return repository.save(pessoa);
    }
}

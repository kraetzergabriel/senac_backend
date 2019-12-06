package br.com.senac.marmeteria.controller;

import br.com.senac.marmeteria.domain.Categoria;
import br.com.senac.marmeteria.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaRepository repository;

    @PostMapping
    public void salvar(@RequestBody @Valid Categoria categoria){
        repository.save(categoria);
    }

    @GetMapping
    public List<Categoria> categorias(){
        return repository.findAll();
    }
}

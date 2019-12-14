package br.com.senac.prova.controller;

import br.com.senac.prova.domain.TipoDespesa;
import br.com.senac.prova.repository.TipoDespesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/despesa")
public class TipoDespesaController {
    @Autowired
    private TipoDespesaRepository repository;

    @CrossOrigin
    @GetMapping()
    public List<TipoDespesa> findAll(){
        return repository.findAll();
    }

    @CrossOrigin
    @PostMapping
    public TipoDespesa salvar(@RequestBody @Valid TipoDespesa tipoDespesa){
        return this.repository.save(tipoDespesa);
    }
}

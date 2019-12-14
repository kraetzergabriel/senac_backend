package br.com.senac.prova.controller;

import br.com.senac.prova.domain.ContaPagar;
import br.com.senac.prova.repository.ContaPagarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sun.reflect.annotation.ExceptionProxy;

import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping("/conta")
public class ContaPagarController {
    @Autowired
    private ContaPagarRepository repository;

    @PostMapping
    @CrossOrigin
    public ResponseEntity<?> salvar(@RequestBody @Valid ContaPagar contaPagar){
        if (contaPagar.getDataVencimento().isAfter(contaPagar.getDataEmissao())) {
            return ResponseEntity.badRequest().body("DataVencimento: não poderá ser maior que a data de emissão");

        }
        return ResponseEntity.ok(this.repository.save(contaPagar));
    }

    @CrossOrigin
    @GetMapping("/{codigo}[0-9]")
    public ResponseEntity<?> getById(@PathVariable("codigo") Integer codigo){
        try{
            Optional<ContaPagar> conta = this.repository.findById(codigo);
            if (conta == null) {
                throw new Exception("Essa conta não existe");
            }

            return ResponseEntity.ok(conta);
        }catch (Exception e){
            return ResponseEntity.badRequest().body(e);
        }
    }
}

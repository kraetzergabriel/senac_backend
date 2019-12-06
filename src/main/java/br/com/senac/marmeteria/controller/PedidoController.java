package br.com.senac.marmeteria.controller;

import br.com.senac.marmeteria.domain.Pedido;
import br.com.senac.marmeteria.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/pedido")
public class PedidoController {

    @Autowired
    private PedidoRepository repository;

    @PostMapping
    public void salvar(@RequestBody @Valid Pedido pedido){
        repository.save(pedido);
    }

    @GetMapping
    public List<Pedido> categorias(){
        return repository.findAll();
    }
}

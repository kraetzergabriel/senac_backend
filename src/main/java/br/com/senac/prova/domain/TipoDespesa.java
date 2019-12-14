package br.com.senac.prova.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TipoDespesa {

    @Id
    private Integer codigo;

    private String nome;
}

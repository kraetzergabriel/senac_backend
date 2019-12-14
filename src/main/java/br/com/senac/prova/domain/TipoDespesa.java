package br.com.senac.prova.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TipoDespesa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer codigo;

    private String nome;
}

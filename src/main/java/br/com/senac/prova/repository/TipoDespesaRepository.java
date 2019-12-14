package br.com.senac.prova.repository;

import br.com.senac.prova.domain.TipoDespesa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoDespesaRepository extends JpaRepository<TipoDespesa, Integer> {
}

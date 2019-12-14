package br.com.senac.prova.repository;

import br.com.senac.prova.domain.ContaPagar;
import br.com.senac.prova.vo.TotalConta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ContaPagarRepository extends JpaRepository<ContaPagar, Integer> {

    @Query("select new br.com.senac.prova.vo.TotalConta(b.nome,sum(a.valor))" +
            "from ContaPagar a" +
            "inner join TipoDespesa b" +
            "group by b.nome")
    List<TotalConta> findTotalConta();
}

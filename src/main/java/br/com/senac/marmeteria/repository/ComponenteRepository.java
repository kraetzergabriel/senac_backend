package br.com.senac.marmeteria.repository;

import br.com.senac.marmeteria.domain.Componente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComponenteRepository extends JpaRepository<Componente, Integer> {
}

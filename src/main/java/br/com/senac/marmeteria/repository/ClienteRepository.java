package br.com.senac.marmeteria.repository;

import br.com.senac.marmeteria.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}

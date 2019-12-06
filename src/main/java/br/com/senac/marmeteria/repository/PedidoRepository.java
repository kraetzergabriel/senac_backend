package br.com.senac.marmeteria.repository;

import br.com.senac.marmeteria.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
}

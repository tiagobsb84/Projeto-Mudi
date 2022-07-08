package br.com.tiago.mvc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.tiago.mvc.model.Pedido;
import br.com.tiago.mvc.model.StatusPedidos;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

	List<Pedido> findByStatus(StatusPedidos valueOf);
	
}

package br.com.tiago.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.tiago.mvc.model.Pedido;
import br.com.tiago.mvc.repository.PedidoRepository;

@Controller
public class HomeController {
	
	@Autowired
	private PedidoRepository pedidoRepository;
		
	@GetMapping("/home")
	public String home(Model model) {	
		List<Pedido> pedidos = pedidoRepository.recuperaTodosOsPedidos();
		model.addAttribute("pedidos", pedidos);
		
		return "home";
	}
}

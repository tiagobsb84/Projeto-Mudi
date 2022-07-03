package br.com.tiago.mvc.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.tiago.mvc.model.Pedido;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Xiaomi Redmi Note 11");
		pedido.setUrlImagem("https://m.media-amazon.com/images/I/51e3KdrHuCL._AC_SL1080_.jpg");
		pedido.setUrlProduto("https://www.amazon.com.br/Xiaomi-Redmi-Note-11-Graphite/dp/B09QSB4N2C?ref_=Oct_d_obs_d_16243890011&pd_rd_w=foxSe&content-id=amzn1.sym.574d7dde-c8d1-436d-a7fc-f2654a8c3190&pf_rd_p=574d7dde-c8d1-436d-a7fc-f2654a8c3190&pf_rd_r=QHFBK6GCT4VKE40NAP78&pd_rd_wg=71ThK&pd_rd_r=3bafbffe-8bdd-48e8-9887-2a56114c5c12&pd_rd_i=B09QSB4N2C");
		pedido.setDescricao("Celular Xiaomi");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedidos);
		
		return "home";
	}
}

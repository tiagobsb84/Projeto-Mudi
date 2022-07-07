package br.com.tiago.mvc.dto;

import javax.validation.constraints.NotBlank;

import br.com.tiago.mvc.model.Pedido;

public class RequisicaoNovoPedido {

	@NotBlank(message = "Obrigatório preenchimento do campo com o nome do produto.")
	private String nomeProduto;
	
	@NotBlank(message = "Obrigatório preenchimento do campo com a url do produto.")
	private String urlProduto; 
	
	@NotBlank(message = "Obrigatório preenchimento do campo com a url da imagem.")
	private String urlImagem ; 
	private String descricao;
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getUrlProduto() {
		return urlProduto;
	}
	public void setUrlProduto(String urlProduto) {
		this.urlProduto = urlProduto;
	}
	public String getUrlImagem() {
		return urlImagem;
	}
	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Pedido toPedido() {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto(nomeProduto);
		pedido.setDescricao(descricao);
		pedido.setUrlProduto(urlProduto);
		pedido.setUrlImagem(urlImagem);
		return pedido;
	}
}

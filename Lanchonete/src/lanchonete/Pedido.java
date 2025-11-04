package lanchonete;

import java.util.ArrayList;

public class Pedido {

	private int numero;
	private Cliente cliente;
	private Funcionario funcionario;
	private ArrayList<ItemPedido>itens;
	private double valorTotal;
	
	public Pedido(int numero, Cliente cliente, Funcionario funcionario, ArrayList<ItemPedido> Itens, double valorTotal) {
		
		this.numero = numero;
		this.cliente = cliente;
		this.funcionario = funcionario;
		this.itens = Itens;
		this.valorTotal = valorTotal;
		
	}
	
	
	
	
	public int getNumero() {
		return this.numero;
	}




	public void setNumero(int numero) {
		this.numero = numero;
	}




	public Cliente getCliente() {
		return this.cliente;
	}




	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}




	public Funcionario getFuncionario() {
		return this.funcionario;
	}




	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}




	public ArrayList<ItemPedido> getItens() {
		return this.itens;
	}




	public void setItens(ArrayList<ItemPedido> itens) {
		this.itens = itens;
	}




	public double getValorTotal() {
		return this.valorTotal;
	}




	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}




	void adicinarItem(ItemPedido ItemPedido) {
		
		this.itens.add(ItemPedido);
		
	}
	
	void calcularValor() {
		
		
		
	}
	
	void exibirDetalhes() {
		
		
		
	}
	
}

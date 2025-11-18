package lanchonete;

import java.util.Scanner;

import java.util.ArrayList;

public class Pedido {

	Scanner Leia = new Scanner(System.in);
	
	
	private Cliente cliente;
	private Funcionario funcionario;
	private ArrayList<Lanche>Itens;
	private double valorTotal;
	
	public Pedido( Cliente cliente, Funcionario funcionario) {
		
		
		this.cliente = cliente;
		this.funcionario = funcionario;
		this.Itens = Itens;
		this.valorTotal = valorTotal;
		
		this.Itens = new ArrayList<>();
		
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




	public ArrayList<Lanche> getItens() {
		return this.Itens;
	}




	public void setItens(ArrayList<Lanche> itens) {
		this.Itens = itens;
	}




	public double getValorTotal() {
		return this.valorTotal;
	}




	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}




	void adicinarItem(Lanche Lanche) {
		int i;
		System.out.println("quantos lanches?");
		i = Leia.nextInt();
		Lanche.setQuantidade(i);
		this.Itens.add(Lanche);
		
	}
	
	void calcularValor() {
		
		
		
	}
	
	void exibirDetalhes() {
		
		 
		   System.out.println("DETALHES DO PEDIDO: \nFuncionario : "+this.funcionario.getNome()+"\n Cliente: "+this.cliente.getNome());
		for(Lanche L : Itens) {
			
			L.info();
			
		}
	}
	
}

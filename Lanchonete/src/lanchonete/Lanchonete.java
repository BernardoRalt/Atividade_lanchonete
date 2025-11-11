
package lanchonete;

import java.util.*;

import java.util.Scanner;

import java.util.ArrayList;

public class Lanchonete {

	
	Scanner Leia = new Scanner(System.in);
	
	private String nome;
	private ArrayList<Lanche> cardapio;
	private ArrayList<Pedido> pedidos;
	private ArrayList<Funcionario> funcionarios;
	
	public Lanchonete() {
		
		Lanche Calabresa = new Lanche("Calabresa", 15);
		Lanche quatro_queijos = new Lanche("4 Queijos", 15);
		Lanche marguerita = new Lanche("Marguerita", 15);
		Lanche frango_catupiry = new Lanche("Frango com catupiry", 15);
		Lanche camarao = new Lanche("Camarão", 20);
		Lanche peperonni = new Lanche("Pepperoni", 15);
		Lanche 	alcatra = new Lanche("Alcatra", 15);
		Lanche portuguesa = new Lanche("portuguesa", 15);
		Lanche geleia = new Lanche("Queijo bire com geleia de pimenta", 20);

		
		this.cardapio = new ArrayList<>();
		
		Collections.addAll(cardapio, Calabresa,quatro_queijos, marguerita, frango_catupiry, camarao, peperonni, alcatra, portuguesa, geleia);
	}
	

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Lanche> getCardapio() {
		return this.cardapio;
	}

	public void setCardapio(ArrayList<Lanche> cardapio) {
		this.cardapio = cardapio;
	}

	public ArrayList<Pedido> getPedidos() {
		return this.pedidos;
	}

	public void setPedidos(ArrayList<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public ArrayList<Funcionario> getFuncionarios() {
		return this.funcionarios;
	}

	public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	
	void adicionarLancheAoCardapio(Lanche lanche) {
		
		this.cardapio.add(lanche);
		
	}
	
	void criarPedido() {
		
		Funcionario funcionario = new Funcionario();
		
		Cliente cliente = new Cliente();
		
		System.out.println("qual o Funcionario que esta atendento?");
		String x = Leia.nextLine();
		funcionario.setNome(x); 
		
		System.out.println("Qual o nome do cliente?");
		String y = Leia.nextLine();
		cliente.setNome(y);
		
		Pedido P1 = new Pedido(cliente, funcionario);
		
		this.pedidos.add(P1);
	}
	
	void contratarFuncionario(Funcionario funcionario) {
		
		this.funcionarios.add(funcionario);
		
	}
	
	void listarFuncionarios() {
		
		for(Funcionario funcionarios: this.funcionarios) {
			
			System.out.println(""+funcionarios);
			
		}
		
	}
	
	void listarPedidos() {
		
		for(Pedido pedidos:this.pedidos) {
			
			System.out.println(""+pedidos);
			
		}
		
	}
	
	void listarCardapio() {
		int o = 1;
		for(Lanche lanche:this.cardapio) {
		
			System.out.println(""+lanche.getNome());
			System.out.println(""+lanche.getPreco());
			System.out.println("Código do pedido: "+o);
			System.out.println("--------------------------------------------------------------");
		o ++;
		}

	}
	


}


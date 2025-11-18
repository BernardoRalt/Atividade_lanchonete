
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
		
		Funcionario fun1 = new Funcionario("atendente", "Roberto", "1973665321");
		Funcionario fun2 = new Funcionario("atendente", "Ana Beatriz Silva", "419.872.360-06");
		Funcionario fun3 = new Funcionario("atendente", "Marcos Vinícius Almeida", "582.140.987-40");
		Funcionario fun4 = new Funcionario("atendente", "Juliana Rocha Costa", "307.561.228-12");
		Funcionario fun5 = new Funcionario("atendente", "Rafael Martins Oliveira", "916.204.753-09");
		Funcionario fun6 = new Funcionario("atendente", "Fernanda Souza Ribeiro", "284.795.610-50"); 	
		
		this.cardapio = new ArrayList<>();
		this.funcionarios = new ArrayList<>();
		this.pedidos = new ArrayList<>();
		
		Collections.addAll(funcionarios, fun1,fun2,fun3,fun4,fun5,fun6);
		
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
		Funcionario f = null;
		boolean dados = false;
		
		do{
			System.out.println("qual o Funcionario que esta atendento?");
		String nomeDoFuncionario = Leia.nextLine();
		
	
		
		for(Funcionario func : funcionarios) {
			
			if(func.getNome().equalsIgnoreCase(nomeDoFuncionario)) {
				dados = true;
				f = func;
				break;
				
			}else {
				dados = false;
				System.out.println("tem nimguem com esse nome nao");
				
			}
			
		}
		}while(dados == false);
		
		System.out.println("Qual o nome do cliente?");
		String y = Leia.nextLine();
		System.out.println("Qual o numero do cliente?");
		String num = Leia.nextLine();
		System.out.println(" endereço do cliente? ");
		String end = Leia.nextLine();
		System.out.println("qual o cpf do Cliente?");
		String cpf = Leia.nextLine();
		
		Cliente c1 = new Cliente(num, end, y, cpf);
		
		Pedido p1 = new Pedido(c1, f);
		
		pedidos.add(p1);
		
		boolean veri = false;
		
		int x;
		
		do{
			System.out.println("Qual sabor o Cliente quer? ");
		String nomeDoSabor = Leia.nextLine();
		
		Lanche L = null;
		
		for(Lanche L1 : cardapio) {
			
			if(L1.getNome().equalsIgnoreCase(nomeDoSabor)) {
				
				veri = true;
				L = L1;
				break;
				
			}else {
				veri = false;
			}
			
		}
		
		if(L != null) {
		p1.adicinarItem(L);
		}else {System.out.println("Lanche não encontrado");
		}
		System.out.println("deseja adicionar mais algum item?\n 1 - sim \n 0 - não");
		x = Leia.nextInt();
		Leia.nextLine();
		
		}while( x != 0);
		
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


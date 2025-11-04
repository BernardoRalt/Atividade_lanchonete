
package lanchonete;

import java.util.ArrayList;

public class Lanchonete {

	private String nome;
	private ArrayList<Lanche> cardapio;
	private ArrayList<Pedido> pedidos;
	private ArrayList<Funcionario> funcionarios;
	
	public Lanchonete( ArrayList<Lanche> cardapio, ArrayList<Pedido> pedidos, ArrayList<Funcionario> funcionarios, String nome) {
		
		this.cardapio = cardapio;
		this.funcionarios = funcionarios;
		this.nome = nome;
		this.pedidos = pedidos;
		
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
	
	void criarPedido(Cliente cliente, Funcionario funcionario) {
		
		
		
		
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
		
		for(Lanche lanche:this.cardapio) {
		
			System.out.println(""+lanche);
			
		}

	}
	
	
		
	}


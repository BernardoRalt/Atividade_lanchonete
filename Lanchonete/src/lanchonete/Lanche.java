package lanchonete;

public class Lanche {

	private String nome;
	private double preco;
	private int quantidade;
	
	public Lanche(String nome, double preco) {
		
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}


	public String getNome() {
		return this.nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPreco() {
		return this.preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public int getQuantidade() {
		return this.quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	

	public void info() {
		
		System.out.println("Nome: "+this.nome);
		System.out.println("Quantidade: "+this.quantidade);
		
	}
	
}


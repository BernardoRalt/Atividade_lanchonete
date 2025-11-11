package lanchonete;

abstract class Pessoa {

	protected String nome;
	protected String cpf;
	
	public Pessoa() {
		
		this.nome = nome;
		this.cpf = cpf;
		
	}
	
	protected String getNome() {
		
		return this.nome;
		
	}
	
protected void setNome(String nome) {
		
	this.nome = nome;
		
	}

protected String getCpf() {
	return this.cpf;
}

protected void setCpf(String cpf) {
	this.cpf = cpf;
}	
	

}

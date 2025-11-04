package lanchonete;

public class Cliente extends Pessoa {

	private String telefone; 
	private String endereco;
	
	public Cliente(String telefone, String endereco, String nome, String cpf) {
		
		super(nome,cpf);
		
		this.telefone = telefone;
		this.endereco = endereco;
		
	}

	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
}

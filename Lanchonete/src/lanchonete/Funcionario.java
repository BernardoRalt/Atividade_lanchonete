package lanchonete;

public class Funcionario extends Pessoa {

	private String cargo;
	
	public Funcionario() {
		
		super(nome,cpf);
		
		this.cargo = cargo;
		
	}
	
	String getcargo() {
		
		return this.cargo;
		
	}
	
	void setcargo(String cargo) {
		
		this.cargo = cargo;
		
	}
	
}

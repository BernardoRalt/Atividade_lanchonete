package lanchonete;

public class ItemPedido {

	private Lanche lanche;
	private int quantidade;
	private double subtotal;
	
	public ItemPedido(Lanche lanche, int quantidade, double subtotal) {
		
		this.lanche = lanche;
		this.quantidade = quantidade;
		this.subtotal = subtotal;
		
	}

	public Lanche getLanche() {
		return this.lanche;
	}

	public void setLanche(Lanche lanche) {
		this.lanche = lanche;
	}

	public int getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getSubtotal() {
		return this.subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	
	
	
}

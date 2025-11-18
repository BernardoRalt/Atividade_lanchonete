package lanchonete;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner Leia = new Scanner(System.in);
		
		Lanchonete L1 = new Lanchonete();

		
		int escolha;
		
		do{System.out.println("Bem vindo à Pizzaria RALT'S Delicias");
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("Escolhas uma das opções abaixo (digitando o seu número respectivamente)");
		
		System.out.println("1 - ver cardapio \n 2 - Fazer pedido \n 3 - gerenciamento da pizzaria \n 0 - sair ");
		escolha = Leia.nextInt();
		
		switch (escolha) {
		
		   case 1: 
			   int i =0;
			    System.out.println("A Pizzarai RALT'S Delicias usa ingredientes da melhor qualidade do mercado, dito isso aqui esta o cardapio:");
			   
			   		L1.listarCardapio();
			   
			   System.out.println("");
			   
			   break;
			   
		   case 2: 
			   
			   L1.criarPedido();
			   int x =0;
			  
			   System.out.println("Oq o cliente deseja realizar");
			   System.out.println("1 - pedir informaçõs do pedido \n 2 - realizar pagamento");
			   x = Leia.nextInt();
			   switch (x) {
			   
			   case 1:
				  
				   L1.getPedidos().get(0).exibirDetalhes();
				   break;
				   
			   case 2:
				   
				   System.out.println("----------------PAGAMENTO----------------");
				   System.out.println("Itens pedidos          unidades          valor por unidade");
				   
				   for(Lanche L : L1.getPedidos().get(0).getItens()) {
				   System.out.println(L.getNome()+"          "+L.getQuantidade()+"          "+L.getPreco());
				   }
				   double valor = 0;
				   for(Lanche Le : L1.getPedidos().get(0).getItens()) {
					   
					   valor = Le.getPreco()*Le.getQuantidade();
					   
				   }
				   
				   System.out.println("Valor final: "+valor);
				   
				   System.out.println("Forma de pagamento \n 1 - Crédito\n2 - débito\n3 - pix\n4 - fiado");
				   
				   
				   break;
			   }
			   
			   
		}
		}while(escolha != 0);
	}

}

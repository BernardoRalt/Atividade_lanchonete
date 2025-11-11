package lanchonete;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner Leia = new Scanner(System.in);
		
		Lanchonete L1 = new Lanchonete();

		
		int escolha;
		
		System.out.println("Bem vindo à Pizzaria RALT'S Delicias");
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("Escolhas uma das opções abaixo (digitando o seu número respectivamente)");
		
		System.out.println("1 - ver cardapio \n 2 - Fazer pedido \n 3 - gerenciamento da pizzaria \n 0 - sair ");
		escolha = Leia.nextInt();
		
		switch (escolha) {
		
		   case 1: 
			   int i =0;
			   System.out.println("A Pizzarai RALT'S Delicias usa ingredientes da melhor qualidade do mercado, dito isso aqui esta o cardapio:");
			   
			   L1.listarCardapio();
			   
			   break;
			   
		   case 2: 
			   
			   L1.criarPedido();
			   int x =0;
			   System.out.println("Oque vc pretende fazer?");
			   System.out.println("1 - adicionar item \n 2 - calcular valor \n 3 - exibir informaçõs do pedido");
			   x = Leia.nextInt();
			   switch (x) {
			   
			   case 1:
				   Lanche y = new Lanche("vamo",15);
				   System.out.println("Qual o lanche que o cliente gostaria de adicionar?");
				
				   L1.getPedidos().get(0).adicinarItem(y);
				   
				  
			   
			   }
			   
			   
		}
	}

}

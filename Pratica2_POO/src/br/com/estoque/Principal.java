package br.com.estoque;

public class Principal {

	public static void main(String[] args) {
		
		
		Estoque estoque1 = new Estoque("Caneta",100,1);

		System.out.println(estoque1.getNome() + " - Estoque atual: " + estoque1.getQtdAtual() + " - Estoque minimo: " + estoque1.getQtdMinima() ); 
		estoque1.setNome("Caneta Azul");	
		System.out.println(estoque1.getNome());
		
		estoque1.darBaixa(50);
		System.out.println("\nPrecisa repor o estoque? " + estoque1.precisaRepor());
		
		System.out.println(estoque1.mostra());
		
		estoque1.darBaixa(70);
		
		
		
	
		/*Estoque estoque2 = new Estoque();
		estoque2.setNome("Apagador");
		estoque2.setQtdAtual(10);
		estoque2.setQtdMinima(2);
		System.out.println(estoque2.getNome() + " - Estoque atual: " + estoque2.getQtdAtual() + " - Estoque minimo: " + estoque2.getQtdMinima() ); 	
		estoque2.setNome("Borracha");
		System.out.println(estoque2.getNome());*/
	
		
		
	
	
	
	
	
	
	
	
	}

}
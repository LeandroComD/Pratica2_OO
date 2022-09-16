package br.com.rendimento;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor incial: ");
		double vrInicial = ler.nextDouble();
		
		System.out.println("Digite a taxa de rendimento: ");
		double txRend = ler.nextDouble();
		
		System.out.println("Digite o numero de meses para o Rendimento: ");
		int numMes = ler.nextInt();
		
		
		Rendimento rendimento1 = new Rendimento(vrInicial,txRend,numMes);
		
		rendimento1.calculaRendimento();		
		

	}

}
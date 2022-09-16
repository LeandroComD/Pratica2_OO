package br.com.rendimento;

import java.text.NumberFormat;

public class Rendimento {
	
	private double invIncial;
	private double taxaRen;
	private int numMes;
	
	
	public Rendimento(double invIncial, double taxaRen, int numMes) {
		super();
		this.numMes = numMes;
		this.taxaRen = taxaRen;
		this.invIncial = invIncial;
	}


	public int getNumMes() {
		return numMes;
	}


	public void setNumMes(int numMes) {
		this.numMes = numMes;
	}


	public double getTaxaRen() {
		return taxaRen;
	}


	public void setTaxaRen(double taxaRen) {
		this.taxaRen = taxaRen;
	}


	public double getInvIncial() {
		return invIncial;
	}


	public void setInvIncial(double invIncial) {
		this.invIncial = invIncial;
	}
	
	
	public void calculaRendimento() {
		
		double rendimentoMes;
		rendimentoMes=getInvIncial(); //rendimento mes comeca com o valor inicial
		System.out.println("Valor Inicial: " + NumberFormat.getCurrencyInstance().format(getInvIncial()));
		System.out.println("Taxa de rendimento: " + NumberFormat.getPercentInstance().format(getTaxaRen()/100));
		
		for(int i=0;i<this.getNumMes();i++) {
		
			rendimentoMes=rendimentoMes*getTaxaRen()/100+rendimentoMes;
			
			System.out.println("\nMes " + (i+1) + ": " + NumberFormat.getCurrencyInstance().format(rendimentoMes));
			
		}
		
	}
	

}
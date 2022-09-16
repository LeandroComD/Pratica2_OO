package br.com.estoque;

public class Estoque {
	
	private String nome; //atributo da classe
	private int qtdAtual;//atributo da classe
	private int qtdMinima;//atributo da classe
	
	public Estoque() {
		
	}
	
	public Estoque(String nome, int qtdAtual, int qtdMinima) {
		super();
		this.nome = nome; // this é o operador que referencia o atributo da própria classe
		this.qtdAtual = qtdAtual;
		this.qtdMinima = qtdMinima;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQtdAtual() {
		return qtdAtual;
	}

	public void setQtdAtual(int qtdAtual) {
		this.qtdAtual = qtdAtual;
	}

	public int getQtdMinima() {
		return qtdMinima;
	}

	public void setQtdMinima(int qtdMinima) {
		this.qtdMinima = qtdMinima;
	}
	
	//set é o método para alterar o atributo
	//get é método para retornar o conteúdo do atributo
	
	
	public void darBaixa(int qtde){
		
		if (qtde<=this.qtdAtual)
			this.qtdAtual -= qtde;	
		else 
		System.out.println("Impossivel dar baixa no estoque!");
	}
	
	public boolean precisaRepor() {
		if (this.qtdAtual<=this.qtdMinima)
			return true;
		else
			return false;	
	}
	
	public String mostra() {
		return "Produto: " + getNome() + "\nEstoque Atual: " + getQtdAtual() + "\nEstoque Minimo: " + getQtdMinima();
	}
	
}
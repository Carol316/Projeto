package maquiagem;

import cosmeticos.Cosmeticos;

public abstract class Maquiagem extends Cosmeticos{
	protected String cor;
	public Maquiagem(String nome, double preco, String marca, String cor) {
		super(nome, preco, marca);
		this.cor = cor;	
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	

	public abstract void calcularDesconto(double percentualDesconto);
	public abstract void aplicar();
	
}

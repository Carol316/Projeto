package maquiagem;

public class Pincel extends Maquiagem {
	private String tamanho;
	
	public Pincel(String nome, double preco, String marca, String cor, String tamanho) {
		super(nome, preco, marca, cor);
		this.tamanho = tamanho;
	}


	@Override
	public void calcularDesconto(double percentualDesconto) {
		double desconto = getPreco() * percentualDesconto / 100;
		double precoDesconto = getPreco() - desconto;
		System.out.println("Preço do pincel com Desconto de: " + percentualDesconto + "%: R$" + precoDesconto );

	}

	@Override
	public void aplicar() {
		System.out.println("Utilizando Pincel: " + getNome());
		System.out.println("Cor: " + getCor());
		System.out.println("Tamanho do Pincel : " + tamanho);
		System.out.println("============");

	}


	public String getTamanho() {
		return tamanho;
	}


	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	public String getNome( ) {
		return super.getNome();
	}
}

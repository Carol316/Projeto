package maquiagem;

public class PaletaSombra extends Maquiagem {
	private int numeroCores;

	public PaletaSombra(String nome, double preco, String marca, String cor, int numeroCores) {
		super(nome, preco, marca, cor);
		this.numeroCores = numeroCores;
		
	}

	@Override
	public void calcularDesconto(double percentualDesconto) {
		double desconto = getPreco() * percentualDesconto / 100;
		double precoDesconto = getPreco() - desconto;
		System.out.println("Preço do numeroCores com Desconto de: " + percentualDesconto + "%: R$" + precoDesconto );

	}

	@Override
	public void aplicar() {
		System.out.println("Aplicando Sombra: " + getNome());
		System.out.println("Cor: " + getCor());
		System.out.println("NumerodeCores : " + numeroCores);
		System.out.println("============");

	}

	public int getNumeroCores() {
		return numeroCores;
	}

	public void setNumeroCores(int numeroCores) {
		this.numeroCores = numeroCores;
	}
	
	public String getNome() {
		return super.getNome();
	}

}

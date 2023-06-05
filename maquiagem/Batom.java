package maquiagem;

public class Batom extends Maquiagem {
	private String tipoBatom;
	
	public Batom(String nome, double preco, String marca, String cor, String tipoBatom) {
		super(nome, preco, marca, cor);
		this.tipoBatom = tipoBatom;
	}
	
	@Override
	public void calcularDesconto(double percentualDesconto) {
		double desconto = getPreco() * percentualDesconto / 100;
		double precoDesconto = getPreco() - desconto;
		System.out.println("Preço da Batom com Desconto de: " + percentualDesconto + "%: R$" + precoDesconto );

	}

	@Override
	public void aplicar() {
		System.out.println("Aplicar Batom: " + getNome());
		System.out.println("Cor: " + getCor());
		System.out.println("Tipo Base: " + tipoBatom);
		System.out.println("============");

	}

	public String getTipoBatom() {
		return tipoBatom;
	}

	public void setTipoBatom(String tipoBatom) {
		this.tipoBatom = tipoBatom;
	}

	public String getNome() {
		return super.getNome();
	}
}

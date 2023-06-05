package maquiagem;

public class Base extends Maquiagem {
	private String tipoBase;
	

	public Base(String nome, double preco, String marca, String cor, String tipoBase) {
		super(nome, preco, marca, cor);
		this.tipoBase = tipoBase;
	}

	@Override
	public void calcularDesconto(double percentualDesconto) {
		double desconto = getPreco() * percentualDesconto / 100;
		double precoDesconto = getPreco() - desconto;
		System.out.println("Preço da Base com Desconto de: " + percentualDesconto + "%: R$" + precoDesconto );
		
	}

	@Override
	public void aplicar() {
		System.out.println("Aplicar Base: " + getNome());
		System.out.println("Cor: " + getCor());
		System.out.println("Tipo Base: " + tipoBase);
		System.out.println("============");
		
	}

	public String getTipoBase() {
		return tipoBase;
	}

	public void setTipoBase(String tipoBase) {
		this.tipoBase = tipoBase;
	}

	public String getNome() {
		return super.getNome();
	}
}

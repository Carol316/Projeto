package maquiagem;

public class MascaraCilios extends Maquiagem {
	private String tipoMascaraCilios;

	public MascaraCilios(String nome, double preco, String marca, String cor, String tipoMascaraCilios) {
		super(nome, preco, marca, cor);
		this.tipoMascaraCilios = tipoMascaraCilios;
	}

	@Override
	public void calcularDesconto(double percentualDesconto) {
		double desconto = getPreco() * percentualDesconto / 100;
		double precoDesconto = getPreco() - desconto;
		System.out.println("Preço da MascaraCilios com Desconto de: " + percentualDesconto + "%: R$" + precoDesconto );
	}

	@Override
	public void aplicar() {
		System.out.println("Aplicando MascaraCilios: " + getNome());
		System.out.println("Cor: " + getCor());
		System.out.println("Tipo : " + tipoMascaraCilios);
		System.out.println("============");

	}

	public String getMascaraCilios() {
		return tipoMascaraCilios;
	}

	public void setMascaraCilios(String mascaraCilios) {
		tipoMascaraCilios = mascaraCilios;
	}

	public String getNome() {
		return super.getNome();
	}
}

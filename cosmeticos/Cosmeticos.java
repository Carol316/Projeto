package cosmeticos;

public class Cosmeticos {
	protected String Nome;
	protected double Preco;
	protected String Marca;
	public Cosmeticos(String nome, double preco, String marca) {
		super();
		Nome = nome;
		Preco = preco;
		Marca = marca;
	}
	
	public String getNome() {
		return Nome;
	}
	
	public void setNome(String nome) {
		Nome = nome;
	}
	
	public double getPreco() {
		return Preco;
	}
	
	public void setPreco(double preco) {
		Preco = preco;
	}
	
	public String getMarca() {
		return Marca;
	}
	
	public void setMarca(String marca) {
		Marca = marca;
	}
	
}

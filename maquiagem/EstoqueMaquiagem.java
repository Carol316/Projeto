package maquiagem;

import java.util.ArrayList;
import java.util.List;

public class EstoqueMaquiagem {
	private List<Base> bases;
	private List<Batom> batons;
	private List<MascaraCilios> mascarasCilios;
	private List<PaletaSombra> paletaSombras;
	private List<Pincel> pinceis;

	public EstoqueMaquiagem() {
		bases = new ArrayList<>();
		batons = new ArrayList<>();
		mascarasCilios = new ArrayList<>();
		paletaSombras = new ArrayList<>();
		pinceis = new ArrayList<>();

	}

	// Metodos de adição do produto.

	public void adicionarBase(Base base) {
		bases.add(base);
	}

	public void adicionarBatom(Batom batom) {
		batons.add(batom);
	}

	public void adicionarMascaraCilios(MascaraCilios mascaraCilios) {
		mascarasCilios.add(mascaraCilios);
	}

	public void adicionarPaletaSombra(PaletaSombra paletaSombra) {
		paletaSombras.add(paletaSombra);
	}

	public void adicionarPincel(Pincel pincel) {
		pinceis.add(pincel); 
	}

	// Métodos de atualização dos produtos.

	public void atualizarBase(int index, Base base) {
		if (index >= 0 && index < bases.size()) {
			bases.set(index, base);
		} else {
			System.out.println("Indice Inválido!");
		}
	}

	public void atualizarBatom(int index, Batom batom) {
		if (index >= 0 && index < batons.size()) {
			batons.set(index, batom);
		} else {
			System.out.println("Indice Inválido!");
		}
	}

	public void atualizarMascaraCilios(int index, MascaraCilios mascarascilios) {
		if (index >= 0 && index < mascarasCilios.size()) {	
			mascarasCilios.set(index, mascarascilios);
		} else {
		System.out.println("Indice Inválido!");
		}
	}
			
	public void atualizarPaletaSombra(int index, PaletaSombra paletaSombra) {
		if(index >= 0 && index < paletaSombras.size()) {
			paletaSombras.set(index, paletaSombra);
		} else {
			System.out.println("Indice Inválido!");
		}
	}
	
	public void atualizarPincel(int index, Pincel pincel) {
		if(index >= 0 && index < pinceis.size()) {
			pinceis.set(index, pincel);
		} else {
		System.out.println("Indice Inválido!");
		}
	}
	
	public void removerBase(int index) {
		if (index >= 0 && index < bases.size()) {
			bases.remove(index);
		} else {
			System.out.println("Indice Inválido");
		}
	}
	
}






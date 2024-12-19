package gestioneNegozio;

public class Prodotto {
	
	private String nome;
	private String categoria;
	private int prezzo;
	
	//costruttore
	public Prodotto(String nome, String categoria, int prezzo) {
		
		this.nome = nome;
		this.categoria = categoria;
		this.prezzo = prezzo;
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public int getPrezzo() {
		return prezzo;
	}
	
	public void stampaProdottiDisponibili() {
		
		 System.out.println("Nome: " + nome + "\t Categoria: " + categoria + "\t Prezzo: " + prezzo + "€");
	}

}




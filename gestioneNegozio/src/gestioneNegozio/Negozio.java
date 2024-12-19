package gestioneNegozio;

import java.util.ArrayList;
import java.util.Scanner;

public class Negozio {
	
	private ArrayList <Prodotto> prodottiDisponibili;
	Scanner scanner = new Scanner(System.in);
	
	
	
	//costruttore
	public Negozio() {
		this.prodottiDisponibili = new ArrayList <Prodotto> ();
				
	}
	
	
	//metodo per filtrare i prodotti esistenti nel negozio a seconda della categoria inserita dal cliente
	public void filtraProdottiCategoria (String categoria) {
		
		System.out.println("Prodotti esistenti in questa categoria: "); 
		for (Prodotto prodotto : prodottiDisponibili) {
			if (prodotto.getCategoria().equalsIgnoreCase(categoria)) {
				System.out.print(prodotto.getNome() + "\n");
			}
		}		
	}
	
	
	//metodo per aggiungere prodotti al negozio
	public void aggiungiProdotto(Prodotto nuovoProdotto) {
		for (Prodotto prodotto : prodottiDisponibili) { //controllo che il prodotto non esista già
			if (prodotto.getNome().equalsIgnoreCase(nuovoProdotto.getNome())) {
				System.out.println("Prodotto già esistente.");
				return;
			}
		}
		prodottiDisponibili.add(nuovoProdotto);
	}
	
	
	//metodo per mostrare i prodotti esistenti nel negozio
	public void mostraProdotti() {
		for (Prodotto prodotto : prodottiDisponibili) {
			prodotto.stampaProdottiDisponibili();
		}
	}
	
	
	public Prodotto getProdotto (String nome) {
		for (Prodotto prodotto : prodottiDisponibili) {
			if (prodotto.getNome().equalsIgnoreCase(nome)) {
				return prodotto;
			}
		}
		return null;
	}
	
	
}

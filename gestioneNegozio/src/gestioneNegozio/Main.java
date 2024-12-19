package gestioneNegozio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/* Filtraggio Dati con Negozio e Carrello
			
			Crea una classe Prodotto con attributi nome, categoria e prezzo.
			Crea una classe Negozio con un ArrayList di prodotti disponibili e metodi per:
			- Filtrare i prodotti per categoria.
			- Aggiungere nuovi prodotti al negozio.
			Crea una classe Carrello che contiene un ArrayList di prodotti selezionati.
			- Implementa un metodo per aggiungere un prodotto al carrello.
			- Implementa un metodo per calcolare il totale del carrello.
			Simula un negozio con almeno 5 prodotti e un carrello per un utente, 
			includendo operazioni di filtraggio e acquisto. */
		
		
		//creazione oggetti e variabile
		Negozio negozio = new Negozio(); 
		Carrello carrello = new Carrello();
		Scanner scanner = new Scanner(System.in);
		Prodotto prodottoSelezionato;

		//aggiunta prodotti al negozio
		negozio.aggiungiProdotto(new Prodotto("computer", "elettronica", 300));
		negozio.aggiungiProdotto(new Prodotto("radio", "elettronica", 30));
		negozio.aggiungiProdotto(new Prodotto("sale", "condimenti", 3));
		negozio.aggiungiProdotto(new Prodotto("spaghetti", "pasta", 5));
		negozio.aggiungiProdotto(new Prodotto("lavastoviglie", "elettrodomestici", 500));

		
		while (true) {

		System.out.println("\t \t \t \t \t \t \tBENVENUTO al negozio AllYouCanShop!\nScegli un'opzione fra le seguenti:\n"
				+ "1) Filtrare i prodotti per categoria\n"
				+ "2) Aggiungere un nuovo prodotto al negozio\n"
				+ "3) Aggiungere un nuovo prodotto al carrello\n"
				+ "4) Calcolare il totale del carrello\n"
				+ "0) Esci dal menù");
		
		int inputUtente = scanner.nextInt();
		scanner.nextLine();
		switch (inputUtente) {
		
		case 1: 
			
			System.out.println("Questi sono i prodotti disponibili in negozio: ");
			negozio.mostraProdotti();
			System.out.println("Inserisci la categoria di prodotti che desideri filtrare: ");
			String categoriaUtente = scanner.nextLine();
			negozio.filtraProdottiCategoria(categoriaUtente);
			
			break;
			
		case 2:
			
			System.out.println("Inserisci il nome del prodotto: ");
			String nomeUtente = scanner.nextLine();
			System.out.println("Inserisci la categoria del prodotto: ");
			String categoriaUtente2 = scanner.nextLine();
			System.out.println("Inserisci il prezzo del prodotto: ");
			int prezzoUtente = scanner.nextInt();
			Prodotto prodottoUtente = new Prodotto(nomeUtente, categoriaUtente2, prezzoUtente);
			negozio.aggiungiProdotto(prodottoUtente);
			System.out.println("Prodotto aggiunto!");

			
			break;
			
		case 3:
			
			System.out.println("Scegli fra i seguenti un prodotto da aggiungere al carrello: ");
			negozio.mostraProdotti();
			prodottoSelezionato = negozio.getProdotto(scanner.nextLine());
			carrello.aggiungiCarrello(prodottoSelezionato);
			break;
			
		case 4:
			
			int totale = carrello.calcolaTotale();
			System.out.println("Il totale del carrello è: " + totale + "€");
			break;
			}
		}
	}
}

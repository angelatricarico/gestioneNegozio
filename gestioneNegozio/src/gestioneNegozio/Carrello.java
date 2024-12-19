package gestioneNegozio;

import java.util.ArrayList;

public class Carrello {
	
	ArrayList <Prodotto> prodottiSelezionati;
	 int totale;
	
	 //costruttore
	public Carrello() {
		this.prodottiSelezionati = new ArrayList <Prodotto> ();
		
	}
	
	//metodo per calcolare il totale del carrello a seconda dei prodotti aggiunti in esso
	public int calcolaTotale() {
        int totale = 0;
        for (Prodotto prodotto : prodottiSelezionati) {
            totale += prodotto.getPrezzo();
        }
        return totale;
    }
	
	//metodo per aggiungere prodotti nel carrello
	public void aggiungiCarrello (Prodotto nuovoProdotto) {
		prodottiSelezionati.add(nuovoProdotto);
		System.out.println("Prodotto aggiunto al carrello!");
	}
	

}

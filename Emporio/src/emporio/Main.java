package emporio;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		String[] testo = new String[] {
				"E;U;10;1.5;87678350;Lampada;150",
				"F;U;1000;0.05;87678351;Vite;Testa bombata - Croce",
				"F;U;2000;0.10;87678351;Vite;Testa bombata - Taglio",
				"L;K;1000;0.05;87678352;Tavola;Abete",
				"V;L;200;1.0;87678353;Trattamento;Adatto per contatto alimenti"
		};
		
		// Converto il testo in oggetti che rappresentano il problema
		
		ArrayList<Inventario> prodotto = new ArrayList<Inventario>();
		
		for(int i=0;i<testo.length;i++) {
			//System.out.println(testo[i]);
			//Spezzo con ; e carico l'array di Stringhe
			String riga = testo[i];
			String[] articoli = riga.split(";");
			String reparto = articoli[0];
			String misura = articoli[1];
			double quantita = Double.parseDouble(articoli[2]);
			double euro = Double.parseDouble(articoli[3]);
			String codice = articoli[4];
			String nome = articoli[5];
			String caratteristica = articoli[6];
			
			Inventario a = new Inventario(reparto,misura,quantita,euro,codice,nome,caratteristica);
			prodotto.add(a);
		}
		
		//Si risolve il problema usando gli oggetti caricati sopra
		
		stampaQuantitaPerReparti(prodotto);
		
		for(int i=0; i<prodotto.size();i++)
			System.out.println(prodotto.get(i));
		
		//calcolo del valore totale del magazzino

	}	
		
		public static ArrayList<String> repartiArticoli(ArrayList<Inventario> prodotto) {
			//Array con articoli sommati per reparto
			ArrayList<String> reparti = new ArrayList<String>();
			//Scorro l'ArrayList dei prodotti con un for
			for(int i=0;i<prodotto.size();i++)
				//se il reparto c'è già allora non lo inserisce
				if(!reparti.contains(prodotto.get(i).getReparto()))
					reparti.add(prodotto.get(i).getReparto());
			return reparti;
		}
		
		public static void stampaQuantitaPerReparti(ArrayList<Inventario> prodotto) {
			ArrayList<String> reparti = repartiArticoli(prodotto);
			
			//Somma totale per reparto (Trova i reparti e somma le quantita per tipo di unita di misura)
			//Scorro i reparti con il primo for
			for(int i=0;i<reparti.size();i++) {
				//Somma tutte le quantita in un determinato reparto
				double somma = 0;
				double num = 0;
				//Scorro i prodotti con il secondo for
				for(int j=0;j<prodotto.size();j++) {
					//Metto dentro somma tutte le quantita di un dato reparto
					//Metto in num il numero dei reparti
					if(reparti.get(i).equals(prodotto.get(j).getReparto())) {
						somma += prodotto.get(j).getQuantita();
						num ++;
					}
				}
				
				System.out.println("Reparto: "+reparti.get(i)+" = "+num+" Quantita="+somma);
			}
		}
		
		/*
		
		public static ArrayList<String> valoreTotale() {
			
		}
		
		
		public venditaArticolo (String reparto, String misura, double euro, String codice, String nome, String caratteristica) {
			
		}
		
		
		public inserimentoArticolo (String reparto, String misura, double euro, String codice, String nome, String caratteristica) {
			
		}
		
		
		public cercaCodiceArticolo (String reparto, String misura, double euro, String codice, String nome, String caratteristica) {
			
		}
		*/		
	}


package Articoli;

public class Articolo {
	
	private char reparto;
	private char unitaMisura;
	private double quantita;
	private double prezzo;
	private String codice;
	private String nome;
	private String descrizione;
	
	boolean check (char rep,char mis,double q,double p,String codUn,String nom,String des) {
		if (p>0 && q>0  )
		return false;
		else return true;
	}
	
	Articolo (char rep, char mis, double q, double p, String cod, String nome, String des) {
		
		reparto = rep;
		unitaMisura = mis;
		quantita = q; 
		prezzo = p;
		codice = cod;
		this.nome = nome;
		descrizione = des;
	}
	

	char getReparto() {return reparto;}
	
	char getUnitaMisura() {return unitaMisura;}
	
	double getQuantita() {return quantita;}
	
	double getPrezzo() {return prezzo;}
	
	String getCodice() {return codice;}
	
	String getNome() {return nome;}
	
	String getDescrizione() {return descrizione;}
	
	void stampArticolo () {
		
		System.out.println("Reparto: "+reparto+"\nVenduto a: "+unitaMisura+"\nQuantita: "+quantita+
				"\nPrezzo: "+prezzo+"€\nCodice univoco: "+codice+"\nArticolo: "+nome+
				"\nDescrizione: "+descrizione+"\n");
		    	
	}
}

package Articoli;

public enum consoleEnum {
		
	    a("Menù"), b("Catalogo"), c("Prodotti totali"), d("Valore totale"),
	    e("Ricerca per codice univoco"), f("Inserimento prodotto"), g("Vendita prodotto"),
	    h("Esci");

	
	    private String meaning;

	    consoleEnum(String meaning)  {
	        this.meaning = meaning;
	    }

	    public String getMeaning() {
	        return meaning;
	    }
	    
	}
	

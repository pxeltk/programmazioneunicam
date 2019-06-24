package emporio;

public class Inventario {
	private String reparto;
	private String misura;
	private double quantita;
	private double euro;
	private String codice;
	private String nome;
	private String caratteristica;
	
	public Inventario (String reparto, String misura, 
						double quantita, double euro, 
						String codice, String nome,
						String caratteristica) {
		this.reparto = reparto;
		this.misura = misura;
		this.quantita = quantita;
		this.euro = euro;
		this.codice = codice;
		this.nome = nome;
		this.caratteristica = caratteristica;
		
		/* Inserire qui nel costruttore:
		 * 1) il contatore delle righe non riconosciute;
		 * 2) il controllo con errore del codice duplicato;
		 * 3) il controllo sulle quantita negative.
		 */
	}
	
	public String toString() {
		//metodo per stampare i dati testuali messi dentro
		return reparto+": "+codice+" = "+nome;
	}
	
	public String getReparto() {
		return reparto;
	}
	
	public double getQuantita() {
		return quantita;
	}

}

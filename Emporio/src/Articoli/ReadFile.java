package Articoli;



import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Vector;

public class ReadFile {
	
	public Vector<Articolo> magazzino = new Vector();
	
	public void readTXT() { //throws FileNotFoundException, IOException 
	
		String line = null;
		String[] parametri;
		
		try {
			
		FileReader txt = new FileReader ("EMPORIO.TXT");
		BufferedReader br = new BufferedReader (txt);
		
		while ((line = br.readLine()) != null) {
			
			parametri = (line.split(";"));
				
			char reparto = line.charAt(0);
			char misura = line.charAt(2);
			double quantita = Double.parseDouble(parametri[2]);
			double prezzo = Double.parseDouble(parametri[3]);
			String codiceUnivoco = parametri [4];
			String nome = parametri [5];
			String descrizione = parametri [6];
			
			Articolo item = new Articolo (reparto, misura, quantita, prezzo, codiceUnivoco, nome, descrizione);
				//for (int i = 0; i<5; i++) {System.out.println( i + " " + parametri[i]);}
			item.stampArticolo();
			magazzino.add(item);
				
		}		
				br.close();
				
		} catch (FileNotFoundException e) {
				System.out.println("File non trovato");
		} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	
	public void getArticoli() {
		magazzino.elements();
	}
}

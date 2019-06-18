package Articoli;

import java.util.Scanner;
//MODIFICA DI PROVA 17:37 18/06/2019 by pxel
public class Main {
	
	private static ReadFile obj1 = new ReadFile();
	private static Scanner input = new Scanner(System.in);
	
	public static void main (String[] args) {
	   
			    System.out.println("\t\t\t\t\t\tBenvenuto nel programma!\n\n\n"); 
			    menùPrint(); 
			    
			    consoleEnum opzione = null;
			    
			     while (opzione != consoleEnum.h)
			            
			    	 try {
			         
			         opzione = consoleEnum.values()[Integer.parseInt(input.nextLine().trim())];

			         
			         switch (opzione) {
			          
			         case a:
			          menùPrint();
			                break;
			         case b:
			        	 obj1.readTXT();
			        	 nuovaAzione();
			                break;
			         case c:
			             //....
			        	 nuovaAzione();
			                break;
			         case d:
			        	 //....
			        	 nuovaAzione();
			                break;
			         case e:
			        	 //....
			        	 nuovaAzione();
			                break;
			         case f:
			             //....
			        	 nuovaAzione();
			                break;
			         case g:
			        	 //....
			        	 nuovaAzione();
			        	 break;
			         case h:
			           System.out.println("Grazie di aver usato il programma!");	
			        	 break;
			         default:
			             nonValido();
			          }
			         } catch (IllegalArgumentException e) {
			             nonValido();
			         } catch (ArrayIndexOutOfBoundsException e) {
			        	 nonValido();
			         }
			    }


	  	public static void menùPrint() {

					
				    System.out.println("Digita il numero per l'azione");
			        System.out.println("-------------------------\n");
			        System.out.println("0 - Menù");
			        System.out.println("1 - Mostra catalogo");
			        System.out.println("2 - Numero prodotti tot magazzino");
			        System.out.println("3 - Valore tot magazzino");
			        System.out.println("4 - Ricerca prodotto per codice univoco");
			        System.out.println("5 - Inserisci prodotto");
			        System.out.println("6 - Vendi prodotto");
			        System.out.println("7 - Esci");
			        System.out.println();
					
				}
        public static void nuovaAzione() {
	
          	System.out.println("\n-------------------------------------\n");
            System.out.println("Premi 0 per tornare al menù. Premi 7 per uscire.\n");
            
        }
	  	public static void nonValido() {
	  		System.out.println("Numero non valido. Riprovare.");
	  	}
	  	
	  	
	  	
	}
		
		
		
		
		
package org.lessons.java.security;
//importa l'oggetto Scanner
import java.util.Scanner;
public class PasswordGenerator {
	public static void main(String[] args) {
		
		/*Java mi ha consigliato di aggiungere "try" che ti permette di definire un blocco di codice
		 * e di testarlo per vedere se ci sono errori mentre lo stai eseguendo??*/
		try (//consenti allo Scanner di acquisire informazioni, java mi ha consigliato di aggiungere questo
		Scanner input = new Scanner (System.in)) {
			//chiedi all'utente le varie info
			System.out.println("Inserisci il tuo nome:");
			String nome = input.nextLine();
			System.out.println("Inserisci il tuo cognome:");
			String cognome = input.nextLine();
			System.out.println("Inserisci il tuo colore preferito:");
			String colore = input.nextLine();
			
			System.out.println("Inserisci il giorno della tua data di nascita:");
			int giorno = input.nextInt();
			System.out.println("Inserisci il mese della tua data di nascita:");
			int mese = input.nextInt();
			System.out.println("Inserisci l'anno della tua data di nascita:");
			int anno = input.nextInt();
			
			int sommaDataDiNascita = giorno + mese + anno;       
			
			//genera la password concatenando le stringhe e aggiungendo i trattini
			String risultato = nome + "-" + cognome + "-" + colore + "-" + sommaDataDiNascita;
			//stampa la password
			System.out.println("La tua password generata è: " + risultato);
		}
      
	   }
}

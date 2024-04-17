package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
	
	public static void main (String [] args) {
		String nome;
		String cognome;
		String colorePreferito;
		byte giorno;
		byte mese;
		short anno;
		int somma;
		
		Scanner input = new Scanner(System.in);	
		
		System.out.println("Inserisci il tuo nome");		
		nome = input.nextLine();
		
		System.out.println("Inserisci il tuo cognome");
		cognome = input.nextLine();
		
		System.out.println("Inserisci il tuo colore preferito");
		colorePreferito = input.nextLine();
		
		System.out.println("Inserisci il giorno in cui sei nato");
		giorno = input.nextByte();
		
		System.out.println("Inserisci il mese in cui sei nato");
		mese = input.nextByte();
		
		System.out.println("Inserisci l'anno in cui sei nato");
		anno = input.nextShort();
		
		somma = giorno + mese + anno;
	    System.out.println(somma);			
		
		System.out.println("La tua password è "+ nome + "-" + cognome + "-" + colorePreferito+ "-" + somma);
	}

}

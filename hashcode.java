package main;

import java.util.Scanner;

public class hashcode {

	public static void main(String[] args) {
		boolean run = true;
		while(run) {
		System.out.println("Hashcode-Berechnung");
		System.out.println("Eingabe eines Strings: ");
		
		Scanner zeile = new Scanner(System.in);
		String eingabe = zeile.next();
		
	//Array mit User-Input wird erstellt
		char[] zeichenkette = new char[eingabe.length()];
		for (int i = 0; i < eingabe.length(); i++) {
			zeichenkette[i] = eingabe.charAt(i);
        }
		
	//Ausgabe der Zeichen des Array
		System.out.println("---Zeichen---");
		for (char z : zeichenkette) {
            System.out.println("'" + z + "'");
        }
		
	//Umwandlung Array in Dezimal-Array
		deziArray(zeichenkette);
		int[] deziZeichenkette = deziArray(zeichenkette);
	//Ausgabe Dezimal-Zeichenkette
		System.out.println("---Dezimal---");
		for (int d : deziZeichenkette) {			
			String s = Integer.toString(d);
			System.out.println(s);
        }
		
	//Umwandlung von Dezimal zu Binär 
		binArray(deziZeichenkette);
		String[] binZeichenkette = binArray(deziZeichenkette);
	//Ausgabe Binär-Zeichenkette
		System.out.println("---Binär---");
		for (String b : binZeichenkette) {
			System.out.println(b);
        }
		
		//vereinfachte Hashcode-Berechnung der Eingabe
		System.out.println("---Hashcode als Zahl---");
		int hashcode = 0;
		for (int i = 0; i < eingabe.length(); i++) {
			hashcode ^= eingabe.charAt(eingabe.length() - 1 - i) << i; 
		}
		System.out.println(hashcode);
		
		System.out.println("Noch ein Hashcode berechnen? (ja/nein)");
		Scanner abfrage = new Scanner(System.in);
		String wiederholung = abfrage.next();
		
		if(wiederholung.equals("nein")) {
			run = false;
			}
		}
	}
//Methoden
	//Umwandlung Zeichenkette in Dezimal-Zeichenkette
	private static int[] deziArray(char[] zeichenkette) {
		int[] dezimal = new int[zeichenkette.length];
		for (int i = 0; i < zeichenkette.length; i++) {
	        dezimal[i] = Character.valueOf(zeichenkette[i]);
	    }
		return dezimal;
	}

	//Umwandlung Dezimal-Zeichenkette in Binär-Zeichenkette 
	private static String[] binArray(int[] deziZeichenkette) {
		String[] binZeichenkette = new String[deziZeichenkette.length];
		for (int i = 0; i < deziZeichenkette.length; i++) {
	        String binaer = Integer.toBinaryString(deziZeichenkette[i]);
	        binZeichenkette[i] = binaer;
	    }
		return binZeichenkette;
		}
}
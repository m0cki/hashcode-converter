package main;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class hashcode {

	public static void main(String[] args) {
		System.out.println("Hashcode-Berechnung");
		System.out.println("Eingabe eines Strings: ");
		
		Scanner zeile = new Scanner(System.in);
		String eingabe = zeile.next();
		
		char[] zeichenkette = new char[eingabe.length()];
		for (int i = 0; i < eingabe.length(); i++) {
			zeichenkette[i] = eingabe.charAt(i);
        }
		
		System.out.println("---Zeichen---");
		for (char z : zeichenkette) {
            System.out.println("'" + z + "'");
        }
		
		//Umwandlung von Zeichen zu Dezimalzahl
		System.out.println("---Dezimal---");
		for (char z : zeichenkette) {			
			String s = Character.toString(z);
			try {
				System.out.println(s.getBytes()[0]);
			} catch (Exception e) {
				System.out.println("Fehler bei der Eingabe");
				e.printStackTrace();
			}
        }
		
		System.out.println("---Binär---");
		//Umwandlung von Dezimalzahl zu Binärzahl
		for(char b : zeichenkette) {
			String binaer = Integer.toBinaryString(b);
			System.out.println(binaer);
		}
		
	}

}

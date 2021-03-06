package de.java2enterprise.bmi;

import java.util.Scanner;

import de.java2enterprise.bmi.controller.BMIRechner;
import de.java2enterprise.bmi.model.Fisch;
import de.java2enterprise.bmi.model.Katze;
import de.java2enterprise.bmi.model.Lebewesen;

public class App {
	private Scanner scanner = new Scanner(System.in);
	private Lebewesen lebewesen;
	private String[] ergebnisse = new String[BMIRechner.MAX_ANZAHL]; //void magic numbers [100] 
	private int index = 0;
	
	public static void main(String[] args) {
		new App();

	}

	private App() {
		System.out.print("Bmi (Programm Start)");
		boolean nochmal = true;

		while (nochmal && index < BMIRechner.MAX_ANZAHL) {
			System.out.println("BMI 1=Eingabe 2=Verarbeiten 3=Ausgabe 4=Ende > ");
			int auswahl = scanner.nextInt();
			if (auswahl == 1) {
				gibEin();
			} else if (auswahl == 2) {
				verarbeite();
			} else if (auswahl == 3) {
				gibAus();
			} else if (auswahl == 4) {
				nochmal = false;

			} else {
				System.out.println("BMI Falsche Ausgabe");
			}
		}
		scanner.close();
		System.out.println("Bmi (Programm ende)");
	}

	private void gibEin() {
		while (true) {
			System.out.println("BMI 1=Katze 2=Fish > ");
			int lebenwesentyp = scanner.nextInt();
			if (lebenwesentyp == 1) {
				lebewesen = new Katze();
			} else if (lebenwesentyp == 2) {
				lebewesen = new Fisch();
				break;
			} else {
				System.out.println("BMI falsche ausgabe");
			}
		}
		if(lebewesen instanceof Katze){
			System.out.println("Bmi Katze");
		} else if (lebewesen instanceof Fisch){
			System.out.println("BMI Fisch");
		}

		System.out.print("BMI [Geben Sie den Namen ein] >");
		String name = scanner.next();
		lebewesen.setName(name);

		System.out.print("BMI [Geben Sie die Grosse[m] ein] >");
		double groesse = scanner.nextDouble();
		lebewesen.setGroesse(groesse);

		System.out.print("BMI [Geben Sie den Gewicht[kg] ein] >");
		double gewicht = scanner.nextDouble();
		lebewesen.setGewicht(gewicht);

	}

	private void verarbeite() {
		BMIRechner rechner = new BMIRechner();
		ergebnisse[++index] = rechner.pruefe(lebewesen);

	}

	private void gibAus() {
		int i = -1;
		for (String ergebnis : ergebnisse){ //enhanced for statement
			if (++i > index){
				break;
			}
		System.out.println("BMI(ergebnis = " + ergebnis + ")");
		}
	}

}

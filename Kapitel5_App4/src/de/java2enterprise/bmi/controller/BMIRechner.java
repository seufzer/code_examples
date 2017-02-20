package de.java2enterprise.bmi.controller;

import de.java2enterprise.bmi.model.Lebewesen;

public class BMIRechner {
	
	public final static double BMI_MAX = 25.0;
	public final static double BMI_MIN = 18.50;
	public final static int MAX_ANZAHL = 100;
	
	public String pruefe(Lebewesen lebewesen){
		double bmi = lebewesen.getGewicht() / (lebewesen.getGroesse() * lebewesen.getGroesse());
		String ergebnis = null;
		if(bmi >= BMI_MAX){
			ergebnis = "Ubergewichtig";
		}else if (bmi < BMI_MIN){
			ergebnis = "Untergewichtig";
		}else {
			ergebnis = "Normal";
		}
		return ergebnis;
	}
}

package de.java2enterprise.bmi.controller;
import de.java2enterprise.bmi.model.Lebewesen;

public class BMIrechner {
	public static int zaehler;
	public static final double BMI_MAX = 25.0;
	public static final double BMI_MIN = 18.5;
	
	public final static double rechne(Lebewesen lebewesen) {
		double bmi = lebewesen.getGewicht() / (lebewesen.getGroesse() * lebewesen.getGroesse());
		zaehler++;
		return bmi;
	}
}


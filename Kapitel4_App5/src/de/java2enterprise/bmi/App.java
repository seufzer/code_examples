package de.java2enterprise.bmi;
import de.java2enterprise.bmi.controller.BMIrechner;
import de.java2enterprise.bmi.model.Fisch;
import de.java2enterprise.bmi.model.Katze;
import de.java2enterprise.bmi.model.Lebewesen;

public class App {

	public static void main(String[] args) {
		
		Lebewesen[] lebewesen = new Lebewesen[3];
		
		lebewesen[0] = new Katze("Pimkie",6.0,0.51 );
		lebewesen[0].isst();
		lebewesen[0].isst();
		lebewesen[0].isst();
		System.out.println(lebewesen[0].getName());
		System.out.println(lebewesen[0].getGewicht());
		System.out.println(lebewesen[0].getGroesse());
		double bmi0 = BMIrechner.rechne(lebewesen[0]);
		System.out.println(bmi0);
		System.out.println(
				bmi0 >= BMIrechner.BMI_MAX ? "Uber" :
					(bmi0 < BMIrechner.BMI_MIN ? "Unter" : "Normal"));
		System.out.println("\n");
		
		lebewesen[1] = new Katze("Flo",5.0,0.51 );
		lebewesen[1].isst();
	
		((Katze)lebewesen[1]).spielt();
		lebewesen[1].isst();
		((Katze)lebewesen[1]).spielt();
		System.out.println(lebewesen[1].getName());
		System.out.println(lebewesen[1].getGewicht());
		System.out.println(lebewesen[1].getGroesse());
		double bmi1 = BMIrechner.rechne(lebewesen[1]);
		System.out.println(bmi1);
		System.out.println(
				bmi1 >= BMIrechner.BMI_MAX ? "Uber" :
					(bmi1 < BMIrechner.BMI_MIN ? "Unter" : "Normal"));
		
		System.out.println("\n");
		
		lebewesen[2] = new Fisch();
		lebewesen[2].setName("Pete");
		lebewesen[2].setGewicht(.005); 
		lebewesen[2].setGroesse(0.01);
		lebewesen[2].isst();
		lebewesen[2].isst();
		System.out.println(lebewesen[2].getName());
		System.out.println(lebewesen[2].getGewicht());
		System.out.println(lebewesen[2].getGroesse());
		double bmi2 = BMIrechner.rechne(lebewesen[2]);
		System.out.println(bmi2);
		System.out.println(
				bmi2 >= BMIrechner.BMI_MAX ? "Uber" :
					(bmi2 < BMIrechner.BMI_MIN ? "Unter" : "Normal"));
		System.out.println("Anzahl der Berechungen " + BMIrechner.zaehler);
	}

}

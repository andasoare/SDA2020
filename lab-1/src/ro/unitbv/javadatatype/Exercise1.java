package ro.unitbv.javadatatype;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		
		System.out.println("Hello World");
		
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Introdu nr 1:");
		int nr1 = scanner.nextInt();
		System.out.println("Introdu nr 2:");
		int nr2= scanner.nextInt();
				
		System.out.println("numarul citit este:" +nr1);
		System.out.println("numarul citit este:" +nr2);
		int suma= nr1+nr2;
		int diferenta=nr1-nr2;
		int produs=nr1*nr2;
		double medie= (nr1+nr2)/2;
		double impartire=(double)nr1/nr2;
		
		
		System.out.println("suma numerelor este:"+ suma);
		System.out.println("diferenta numerelor este:"+ diferenta);
		System.out.println("produs numerelor este:"+ produs);
		System.out.println("media numerelor este:"+ medie);
		System.out.println("Impartire:"+impartire);
	}

}

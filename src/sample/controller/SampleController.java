package sample.controller;

import java.util.Scanner;
import sample.model.PlayDohCircle;
import sample.model.PlayDohSquare;

public class SampleController
{

	public void start()
	{
		PlayDohSquare firstSquare = new PlayDohSquare();
		PlayDohSquare secondSquare;
		secondSquare = new PlayDohSquare(100);
		
		
		PlayDohCircle firstCircle = new PlayDohCircle();
		PlayDohCircle secondCircle;
		secondCircle = new PlayDohCircle();
		
		PlayDohCircle thirdCircle;
		thirdCircle = new PlayDohCircle(10);
		
		
		System.out.println("Here is my play doh circle");
		System.out.println(firstCircle);
		System.out.println("Here is my second circle " + secondCircle);
		System.out.println("Here is my third circle " + thirdCircle);
		
		System.out.println("Here is my play doh square");
		System.out.println("firstSquare");
		System.out.println("Here is my second square " + secondSquare);
		
	
		
		
		System.out.println("This is a sample project to show the github and");
		System.out.println("eclipse process so I develop muscle memory :D");
		
		testScanner();
	}
 	

	private void testScanner()
	{
		Scanner firstScanner; //Decalers a Scanner object.
		firstScanner = new Scanner(System.in); //Instanciates a Scanner object.
		System.out.println("Please type your favorite food");
		String answer = firstScanner.nextLine();
		System.out.println("Oh, you like to eat " + answer);
		
	}
}

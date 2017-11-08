import java.util.Scanner; // Imports the scanner utility

public class guessnumber {
	// Program: Numbers Guessing Game, Programming Exercise 3
	// File: guessnumber.java
	// Summary: Generates a random number between 1 and 10000 and tracks how many
	// guesses it takes a user to guess the number
	// Author: Christopher A Lambert
	// Date: 11/7/2017

	public static Scanner input; // Declares the scanner input variable
	public static int min = 1; // Declares min and max variables for the range of the random choice, starting
								// at 1 to 10000
	public static int max = 10000;
	public static int guesses = 0; // Declares the variable for keeping track of guesses
	public static int finalnumber = (int) (Math.random() * (max - min)) + 1; // Chooses a random number between 1 and
																				// 10000, max - min = 9999 so the +1
																				// brings it back to 10000

	public static void main(String[] args) { // Main method

		input = new Scanner(System.in); // Sets the scanner to read input from the console

		System.out.print("Enter a guess between " + min + " and " + max + ": "); // Prints out "Enter a guess between 1
																					// and 10000:" to the console
		int guess = input.nextInt(); // The scanner sets the input to the variable guess
		// if/else math check to see if the input is higher or lower than the randomly
		// generated number
		if (guess < finalnumber) { // If the input number is lower than the generated number it follows this path
			guesses++; // Adds the guess to the count of guesses
			System.out.println("HIGHER"); // Prints "HIGHER" to the console
			min = guess; // Sets the min variable equal to the current guess variable
		
			main(args); // Reinvokes the main method to allow another input
		} else if (guess > finalnumber) { // If the input number is higher than generated number it follows this path
			guesses++; // Adds the guess to the count of guesses
			System.out.println("LOWER"); // Prints "LOWER" to the console
			max = guess; // Sets the max variable equal to the current guess variable
			main(args); // Reinvokes the main method to allow another input
		} else { // If the input number is neither higher nor lower than the generated number, ie
					// equals the generated number, it follows this path
			guesses++; // Adds the guess to the count of guesses
			System.out.println("You WIN! It took you " + guesses + " guesses."); // Prints "You WIN! It took you
																					// (the number of guesses
																					// variable) guesses." to
																					// the console5
		}
	}

}

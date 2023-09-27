
/**
 * Creates a method that determines whether a given string is a palindrome by using a stack
 */
import java.util.*;

/**
 * @author Brandon Esarey
 * @version 5.0 Assignment 2.2 CS215 Semester year Fall 2023
 */
public class PalindromeScanner {
	static Scanner scan = new Scanner(System.in);
	private String potentialPalindrome;

	public PalindromeScanner() {
		setPotentialPalindrome("");
	}// end default constructor

	/**
	 * @param potentialPalindrome
	 */
	public PalindromeScanner(String potentialPalindrome) {
		this.potentialPalindrome = potentialPalindrome;
	}// end preferred constructor

	/**
	 * @return the potentialPalindrome
	 */
	public String getPotentialPalindrome() {
		return potentialPalindrome;
	}// end getPotentialPalindrome()

	/**
	 * @param potentialPalindrome the potentialPalindrome to set
	 */
	public void setPotentialPalindrome(String potentialPalindrome) {
		this.potentialPalindrome = potentialPalindrome;
	}// end setPotentialPalindrome()

	/*
	 * @param potentialPalindrome The method that inserts a given string into a
	 * stack and determines if it is a palindrome.
	 */
	public void PalindromeTester() {
		System.out.println("Please type in a potential palindrome:");
		potentialPalindrome = scan.next();
		setPotentialPalindrome(potentialPalindrome);
		Stack<Character> storage = new Stack<Character>();
		for (int i = 0; i < potentialPalindrome.length(); i++)
			storage.push(potentialPalindrome.charAt(i));
		String reverseInput = "";
		for (int i = potentialPalindrome.length(); i > 0; i--)
			reverseInput = reverseInput + storage.pop();
		if (potentialPalindrome.equalsIgnoreCase(reverseInput))
			System.out.println("Your input is a palindrome!");
		else
			System.out.println("Your input was not a palindrome.");
	}// end PalindromeTester

}// end PalindromeScanner

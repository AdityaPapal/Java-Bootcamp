package Conditional;

import java.util.Scanner;

public class basic {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number   ");
		int num = input.nextInt();
		if (num > 0) {
			System.out.println("Number is Positive");
		} else if (num < 0) {
			System.out.println("Number is Negative");
		} else {
			System.out.println("Number is Zero");
		}
	}
	
}
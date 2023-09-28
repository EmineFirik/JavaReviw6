package com.neotech.reviwe01;

import java.util.Scanner;

public class NestedifRichBoy {
	public static void main(String[] args) {

		// If you are a boy
		// If you are rich -- Buy a Ferrari
		// otherwise -- Play soccer
		// If you are a girl
		// If you are rich -- Buy a LV bag
		// otherwise -- Read a book
		// If you are none
		// Invalid gender

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your gender M/F");
		char gender = scan.next().charAt(0);
		System.out.println("Are you rich? (true /false");
		boolean rich = scan.nextBoolean();

		if (gender == 'F') {
			System.out.println("It is a gril");
			if (rich) {
				System.out.println("Buy LV bag");
			} else {
				System.out.println("Read a book");
			}
		} else if (gender == 'M') {
			System.out.println("It is a boy");
			if (rich) {
				System.out.println("Buy ferrari");
			} else {
				System.out.println("Play soccer");
			}

		} else {
			System.out.println("INvalid gender");
		}

	}

}

package com.neotech.review08;

import java.util.LinkedList;
import java.util.List;

public class LikedList {

	public static void main(String[] args) {
		List<String> asia = new LinkedList<>();
		asia.add("Chine");
		asia.add("Japonya");
		asia.add("India");
		asia.add(1, "Korea");
		System.out.println(asia);

		List<String> asia2 = new LinkedList<>();

		for (String country : asia) {
			if(asia2.contains(country)) {
				System.out.println(country);
			}else {
				asia2.add(country);
			}

			asia2.add(country);
		}
		System.out.println("asia2 ->"+asia2);
	}

}

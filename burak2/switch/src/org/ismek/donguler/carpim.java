package org.ismek.donguler;

import java.util.Scanner;

public class carpim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner klavyedenoku = new Scanner(System.in);
		System.out.println("faktöriyel alinicak sayi gir");
		int alinicaksayi = klavyedenoku.nextInt();

		for (int i = 2; i <= alinicaksayi; i++) {

			System.out.println("************");
			for (int j = 0; j <= 10; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}

		}

		klavyedenoku.close();

	}

}

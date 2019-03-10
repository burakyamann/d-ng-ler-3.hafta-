package org.ismek.donguler;

import java.util.Scanner;

public class bölenbulma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner klavyedenOku = new Scanner(System.in);
		System.out.println("alinicak sayi gir");
		int alinicakSayi = klavyedenOku.nextInt();
		    for (int i = 2; i < alinicakSayi; i++) {
			if (alinicakSayi % i == 0) {
				System.out.println(i + "bölendir");
}
}
}
    }

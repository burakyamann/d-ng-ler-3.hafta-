package org.ismek.donguler;

import java.util.Scanner;

public class faktoriyel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner klavyedenoku = new Scanner(System.in);
		System.out.println("faktöriyel alinicak sayi gir");
		int faktoriyelalinicaksayi = klavyedenoku.nextInt();
		int sonuc = 1;
		for (int i = 1; i <= faktoriyelalinicaksayi; i++) {

			System.out.println(sonuc + "*" + i + "=" + sonuc * i);
			sonuc = sonuc * i;

		}

		System.out.println("son sonuç" + sonuc);

	}

}

package org.ismek.donguler;

import java.util.Random;
import java.util.Scanner;

public class randomsayi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Random rnd = new Random();
		int sayi = rnd.nextInt(10);
		Scanner klavyeOku = new Scanner (System.in);
		int tahmin = 0 ;
		
		while (sayi != tahmin) {
			System.out.println("tahmin gir");
			tahmin = klavyeOku.nextInt();
		
		}
		
		System.out.println("aferin buldun");

		
		
	}

}

package com.Alistirmalar;

import java.util.Scanner;

public class KdvHesapla {

	public static void main(String[] args) {

		int fiyat;
		double kdv;
		double kdvliFiyat;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Fiyatý girin.");
		fiyat = scanner.nextInt();

		if (fiyat > 1000) {
			kdv = 0.08;
			kdvliFiyat = fiyat * (1 + kdv);
		} else {
			kdv = 0.18;
			kdvliFiyat = fiyat * (1 + kdv);
		}
		System.out.println("KDV oraný : " + kdv);
		System.out.println("KDV dahil fiyat : " + kdvliFiyat);
	}

}

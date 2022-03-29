package calisma6;

import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.Scanner;

public class Deneme {
	
	private static final DecimalFormat df = new DecimalFormat("0.00");

	public static void main(String[] args) {
		LinkedList<Calisan> Yeni = new LinkedList<>();
		String exit = "Y";
		Scanner karar = new Scanner(System.in);
		int index = 0;
		do {
			Yeni.add(new Calisan());
			Yeni.get(index).YeniCalisan(karar);
			System.out.println("Y/N");
			exit = karar.next();
			exit = exit.toUpperCase();
			index++;
		} while (!exit.equals("N"));
		System.out.println("Yýllýk Enflasyon Oranýný Girin : ");
		double yenienflasyon = karar.nextDouble();
		for (int i = 0; i < Yeni.size(); i++) {
			Yeni.get(i).setEnflasyon(yenienflasyon);
			System.out.println(Yeni.get(i).getAd() + " / " + Yeni.get(i).getSoyAd() + " / " + Yeni.get(i).getMeslek() + " / "+ Yeni.get(i).getMaas() + " / " + Yeni.get(i).getPerformans());
			
			Yeni.get(i).setMaas(Hesapla.MaasArtir(Yeni.get(i).getEnflasyon(), Yeni.get(i).getMaas()));
			
			Yeni.get(i).setPerformans(Hesapla.PerformansArtir(30.0, 50.0));
			
			System.out.println(Yeni.get(i).getAd() + " / " + Yeni.get(i).getSoyAd() + " / " + Yeni.get(i).getMeslek() + " / "+ Yeni.get(i).getMaas() + " / " + df.format(Yeni.get(i).getPerformans()));
		}
		karar.close();
	}
}

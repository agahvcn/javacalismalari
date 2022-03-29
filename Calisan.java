package calisma6;

import java.util.Scanner;

public class Calisan {

	private String ad;
	private String soyAd;
	private String meslek;
	private double maas;
	private double performans =0;
	private double enflasyon;
	private int yapilanis = 0;
	
	
	public void YeniCalisan(Scanner ekle) {
		System.out.println("Karakter oluþturuluyor...");
		System.out.println("Adý : ");
		setAd(ekle.next());
		System.out.println("Soy Adý : ");
		setSoyAd(ekle.next());
		System.out.println("Mesleði : ");
		setMeslek(ekle.next());
		System.out.println("Maaþý : ");
		setMaas(ekle.nextFloat());
		
		
	}


	public String getAd() {
		return ad;
	}


	public void setAd(String ad) {
		this.ad = ad;
	}


	public String getSoyAd() {
		return soyAd;
	}


	public void setSoyAd(String soyAd) {
		this.soyAd = soyAd;
	}


	public String getMeslek() {
		return meslek;
	}


	public void setMeslek(String meslek) {
		this.meslek = meslek;
	}


	public double getMaas() {
		return maas;
	}


	public void setMaas(double maas) {
		this.maas = maas;
	}


	public double getPerformans() {
		return performans;
	}


	public void setPerformans(double performans) {
		this.performans = performans;
	}


	public double getEnflasyon() {
		return enflasyon;
	}


	public void setEnflasyon(double enflasyon) {
		this.enflasyon = enflasyon;
	}


	public int getYapilanis() {
		return yapilanis;
	}


	public void setYapilanis(int yapilanis) {
		this.yapilanis = yapilanis;
	}

	
}

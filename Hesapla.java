package calisma6;


public class Hesapla {
	
	
	public static double MaasArtir(double enflasyon, double maas) {
		if (enflasyon <= 0.0) {
			System.out.println("Maaþ Artýþý yok.");
		} else {
			maas = (enflasyon * maas) / 100 + maas;
		}

		return maas;
	}

	public static double PerformansArtir(double zaman, double is) {
		double performans=0.0;
	
		if(is/zaman <= 1.0) {
			System.err.println("Çalýþaný uyar : ");
		}else {
			performans = (double)(is/zaman);
		}
		return performans;
	}

}

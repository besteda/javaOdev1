package enBuyukSayi;

public class enBuyukSayi1 {

	public static void main(String[] args) {
		int sayi1 = 24;
		int sayi2 = 30;
		int sayi3 = 6;
		int enBuyuk = sayi1;
		
		if(enBuyuk<sayi2) {
			enBuyuk = sayi2;
		}
		if(enBuyuk<sayi3) {
			enBuyuk = sayi3;
		}
		
		System.out.println("En büyük sayı:"+enBuyuk);
		

	}

}

package intro;

public class AsalSayi {

	public static void main(String[] args) {
		int number = 0;
		int i = 2;
		//int remainder = number % 2;
		boolean isPrime = true;
		if(number==1) {
			System.out.println("Sayı Asal Değildir");
			return;
		}
		if(number<1) {
			System.out.println("Geçersiz Sayı");
		}

		for (i=2; i <number; i++) {
			if (number % i == 0) {
				
				isPrime = false;

			}
		}

		if (isPrime) {
			System.out.print("Sayı Asaldır.");
		} else {
			System.out.print("Sayı Asal Değildir.");
		}

	}

}

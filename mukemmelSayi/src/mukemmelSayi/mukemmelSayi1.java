package mukemmelSayi;

public class mukemmelSayi1 {

	public static void main(String[] args) {
		int number = 6;
		int total = 0;
		for(int i=1; i<number; i++) {
			if(number % i== 0) {
				total = total + i ;
			}
		}
		
		if(total == number) {
			System.out.println("Verilen Sayı Mükemmel Sayıdır");
		}else {
			System.out.println("Verilen Sayı Mükemmel Sayı Değil");
		}
	}

}

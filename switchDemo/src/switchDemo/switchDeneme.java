package switchDemo;

public class switchDeneme {

	public static void main(String[] args) {
		char grade = 'F';
		
		switch(grade) {
			case 'A':
				System.out.println("Mükemmel : Geçtiniz");
				break;
			case 'B':
				System.out.println("Pekiyi : Geçtiniz");
				break;
			case 'C':
				System.out.println("İyi : Geçtiniz");
				break;
			case 'D':
				System.out.println("Ortalama : Geçtiniz");
				break;
			case 'F':
				System.out.println("Maalesef Kaldınız");
				break;
			default:
				System.out.println("Geçersiz Not Girdiniz");
		}

	}

}

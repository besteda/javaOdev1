package sesliHarfler;

public class sesliHarflerProje {

	public static void main(String[] args) {
		char harf = 'Ü';
		
		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalın sesli harf");
			break;
		default:
			System.out.println("İnce sesli harf");
			break;
		}

	}

}

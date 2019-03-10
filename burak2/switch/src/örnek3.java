import java.util.Scanner;

public class örnek3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("ay gir");
		Scanner scanner = new Scanner(System.in);
		int ay = scanner.nextInt();

		switch (ay) {
		case 12:
		case 1:
		case 2:
			System.out.println("Kýþ mevsimi");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("Ýlkbahar mevsimi");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("Yaz mevsimi");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("Sonbahar mevsimi");
			break;
		default:
			System.out.println("Ay bilgisini yanlýþ girdiniz.");
			break;
		}

	}

}

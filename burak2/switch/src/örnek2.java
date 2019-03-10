import java.util.Scanner;

public class örnek2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("gün gir");
		Scanner scanner = new Scanner(System.in);
		String gun = scanner.next();

		switch (gun) {

		case "pazartesi" :
		case "salý":
		case "çarþamba":
		case "perþembe":
		case "cuma":

			System.out.println("seçtiðiniz gün haftaiçi");

			break;

		case "cumartesi":
		case "pazar":

			System.out.println("seçtiðiniz gün haftasonu");

			break;
          
			default:
				
			
		}

	}

}

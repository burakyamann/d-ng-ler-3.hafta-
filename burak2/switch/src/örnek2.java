import java.util.Scanner;

public class �rnek2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("g�n gir");
		Scanner scanner = new Scanner(System.in);
		String gun = scanner.next();

		switch (gun) {

		case "pazartesi" :
		case "sal�":
		case "�ar�amba":
		case "per�embe":
		case "cuma":

			System.out.println("se�ti�iniz g�n haftai�i");

			break;

		case "cumartesi":
		case "pazar":

			System.out.println("se�ti�iniz g�n haftasonu");

			break;
          
			default:
				
			
		}

	}

}

import java.util.Scanner;

public class casee {
	public static void main(String[] args) {
	
		System.out.println("g�n k�saltmas� gir");
		Scanner scanner = new Scanner(System.in);
		String gun =scanner.next();
		
		switch (gun) {
	
	case "pzt" :
		System.out.println("se�ti�iniz g�n pazartesi ve haftai�i");
	break;
	
	case "sl" :
		System.out.println("se�ti�iniz g�n sal� ve haftai�i");
	break;
	case "crs" :
		System.out.println("se�ti�iniz g�n �ar�amba ve haftai�i");
	break;
	case "prs" :
		System.out.println("se�ti�iniz g�n per�embe	 ve haftai�i");
	break;
	case "cm" :
		System.out.println("se�ti�iniz g�n cuma ve haftai�i");
	break;
	case "cmt" :
		System.out.println("se�ti�iniz g�n cumartesi ve haftasonu");
	break;
	case "pzr" :
		System.out.println("se�ti�iniz g�n pazar ve haftasonu");
	break;
	default:
		
		System.out.println("ge�ersiz giri�");
		
		break;
	
	}	
	}
	

	
	
	
	
	
	
	

}

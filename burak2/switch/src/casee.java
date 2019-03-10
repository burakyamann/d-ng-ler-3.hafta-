import java.util.Scanner;

public class casee {
	public static void main(String[] args) {
	
		System.out.println("gün kýsaltmasý gir");
		Scanner scanner = new Scanner(System.in);
		String gun =scanner.next();
		
		switch (gun) {
	
	case "pzt" :
		System.out.println("seçtiðiniz gün pazartesi ve haftaiçi");
	break;
	
	case "sl" :
		System.out.println("seçtiðiniz gün salý ve haftaiçi");
	break;
	case "crs" :
		System.out.println("seçtiðiniz gün çarþamba ve haftaiçi");
	break;
	case "prs" :
		System.out.println("seçtiðiniz gün perþembe	 ve haftaiçi");
	break;
	case "cm" :
		System.out.println("seçtiðiniz gün cuma ve haftaiçi");
	break;
	case "cmt" :
		System.out.println("seçtiðiniz gün cumartesi ve haftasonu");
	break;
	case "pzr" :
		System.out.println("seçtiðiniz gün pazar ve haftasonu");
	break;
	default:
		
		System.out.println("geçersiz giriþ");
		
		break;
	
	}	
	}
	

	
	
	
	
	
	
	

}

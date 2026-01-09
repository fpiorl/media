package Media;

import java.util.Scanner;

public class MediaScanner {
	static public Media scan(Scanner sc) {
		System.out.printf("\ttipo media (audio/video/image): ");
		String tipo = sc.next();
		sc.nextLine();
		
		return switch (tipo.toLowerCase()){
			case "audio" -> {
				System.out.printf("\tTitolo: ");
				String titolo = sc.nextLine();
				System.out.printf("\tVolume: ");
				int volume = sc.nextInt();
				System.out.printf("\tDurata: ");
				int durata = sc.nextInt();
				sc.nextLine(); 
				yield new Audio(titolo, volume, durata);
			}
			case "video" -> {
				System.out.printf("\tTitolo: ");
				String titolo = sc.nextLine();
				System.out.printf("\tVolume: ");
				int volume = sc.nextInt();
				System.out.printf("\tLuminosita: ");
				int luminosita = sc.nextInt();
				System.out.printf("\tDurata: ");
				int durata = sc.nextInt();
				sc.nextLine();
				yield new Video(titolo, volume, luminosita, durata);
			}
			case "image" -> {
				System.out.printf("\tTitolo: ");
				String titolo = sc.nextLine();
				System.out.printf("\tLuminosita: ");
				int luminosita = sc.nextInt();
				sc.nextLine();
				yield new Image(titolo, luminosita);
			}
			default  -> throw new RuntimeException("formato non supportato");
		};
	}
}

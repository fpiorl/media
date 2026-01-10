package Media;

import java.util.Scanner;
import java.util.Random;

public class MediaScanner {
	private final Scanner sc;

	public MediaScanner(Scanner sc) {
		this.sc = sc;
    	}

	public Media nextMedia() {
		System.out.printf("\ttipo media (audio/video/image): ");
		String tipo = this.sc.next();
		this.sc.nextLine();
		
		return switch (tipo.toLowerCase()){
			case "a", "audio" -> { yield this.nextAudio(); }
			case "v", "video" -> { yield this.nextVideo(); }
			case "i", "image" -> { yield this.nextImage(); }
			case "r", "random" -> { yield this.nextRandom(); }
			default  -> throw new RuntimeException("formato non supportato");
		};
	}

	private Audio nextAudio() {
		System.out.printf("\tTitolo: ");
		String titolo = this.sc.nextLine();
		System.out.printf("\tVolume: ");
		int volume = this.sc.nextInt();
		System.out.printf("\tDurata: ");
		int durata = this.sc.nextInt();
		sc.nextLine(); 
		return new Audio(titolo, volume, durata);
	}

	private Video nextVideo(){
		System.out.printf("\tTitolo: ");
		String titolo = this.sc.nextLine();
		System.out.printf("\tVolume: ");
		int volume = this.sc.nextInt();
		System.out.printf("\tLuminosita: ");
		int luminosita = this.sc.nextInt();
		System.out.printf("\tDurata: ");
		int durata = this.sc.nextInt();
		sc.nextLine();
		return new Video(titolo, volume, luminosita, durata);
	}

	private Image nextImage(){
		System.out.printf("\tTitolo: ");
		String titolo = this.sc.nextLine();
		System.out.printf("\tLuminosita: ");
		int luminosita = this.sc.nextInt();
		sc.nextLine();
		return new Image(titolo, luminosita);
	}

	static private final int AUDIO = 0, VIDEO = 1, IMAGE = 2;
	private Media nextRandom(){
		Random r = new Random();
		final int x = r.nextInt(3); // da un numero compreso tra 0 e 2
		return switch(x){
			default -> { yield new Audio("random", r.nextInt(8), r.nextInt(8)); }
			case 1 -> { yield new Video("random", r.nextInt(8), r.nextInt(8), r.nextInt(8)); }
			case 2-> { yield new Image("random", r.nextInt(8)); }
		};
	}
}

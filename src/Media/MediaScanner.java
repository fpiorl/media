package Media;

import java.util.Scanner;
import java.util.Random;

public class MediaScanner {
	private final Scanner sc;
	private final Random random = new Random();

	public MediaScanner(Scanner sc) {
		this.sc = sc;
	}

	public Media nextMedia() {
		System.out.printf("\ttipo media (audio/video/image): ");
		final String tipo = this.sc.next();
		this.sc.nextLine();

		return switch (tipo.toLowerCase()){
			case "a", "audio" -> this.nextAudio();
			case "v", "video" -> this.nextVideo();
			case "i", "image" -> this.nextImage();
			case "r", "random" -> this.nextRandom();
			default  -> throw new RuntimeException("formato non supportato");
		};
	}

	private Audio nextAudio() {
		System.out.printf("\tTitolo: ");
		final String titolo = this.sc.nextLine();
		System.out.printf("\tVolume: ");
		final int volume = this.sc.nextInt();
		System.out.printf("\tDurata: ");
		final int durata = this.sc.nextInt();
		sc.nextLine(); 
		return new Audio(titolo, volume, durata);
	}

	private Video nextVideo(){
		System.out.printf("\tTitolo: ");
		final String titolo = this.sc.nextLine();
		System.out.printf("\tVolume: ");
		final int volume = this.sc.nextInt();
		System.out.printf("\tLuminosita: ");
		final int luminosita = this.sc.nextInt();
		System.out.printf("\tDurata: ");
		final int durata = this.sc.nextInt();
		sc.nextLine();
		return new Video(titolo, volume, luminosita, durata);
	}

	private Image nextImage(){
		System.out.printf("\tTitolo: ");
		final String titolo = this.sc.nextLine();
		System.out.printf("\tLuminosita: ");
		final int luminosita = this.sc.nextInt();
		sc.nextLine();
		return new Image(titolo, luminosita);
	}

	static private final int AUDIO = 0, VIDEO = 1, IMAGE = 2;
	private Media nextRandom(){
		final int x = random.nextInt(3); // da un numero compreso tra 0 e 2
		return switch(x){
			default -> new Audio("random", r.nextInt(8), r.nextInt(8));
			case 1 -> new Video("random", r.nextInt(8), r.nextInt(8), r.nextInt(8));
			case 2-> new Image("random", r.nextInt(8));
		};
	}
}

import java.util.Scanner;
import Media.*;

public class Main {
	public static void main(String[] args) {
		/* guarda mamma senza numeri */
		final byte zero='%'%'%',uno='/'/'/',cinque='!'!='?'?'?'^':':':';
		final Scanner scanner = new Scanner(System.in);
		final MediaScanner mediaScanner = new MediaScanner(scanner);
		final Media[] media = new Media[cinque];

		for (byte i=zero; i<cinque; i++){
			System.out.printf("media id: %d\n", i+uno);
			media[i] = mediaScanner.nextMedia();
		}

		byte numero;
		do {
			System.out.printf("inserisci id del media da eseguire: ");
			numero = scanner.nextByte();
			media[numero-uno].Esegui();
		} while(numero != zero);

		scanner.close();
	}
}

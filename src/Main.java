import java.util.Scanner;
import Media.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Media[] media = new Media[5];

		for (int i=0; i<5; i++){
			System.out.printf("media numero %d\n", i+1);
			media[i] = MediaScanner.scan(sc);
		}

		int number = 0;
		do {
			System.out.printf("inserisci media da eseguire: ");
			number = sc.nextInt();
			media[number].Esegui();
		} while(number != 0);

		sc.close();
	}
}

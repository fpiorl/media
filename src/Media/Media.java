package Media;

public abstract class Media {
	protected String titolo;

	protected Media(String titolo) {
		this.titolo = titolo;
	}

	public void Esegui(){
		switch (this) {
			case Riproduttore r -> r.Riproduci();
			case Image i -> i.Show();
			default -> {}
    		}
	}

}

package negyedikHaziSzerver;

public class Szerver {

	public static void main(String[] args) {
		Hallgato hallgato = new Hallgato();
		Thread hallgatoSzal = new Thread(hallgato);
		hallgatoSzal.start();
	}

}

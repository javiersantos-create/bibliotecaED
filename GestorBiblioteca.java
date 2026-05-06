import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GestorBiblioteca {

	// ATRIBUTS
	private static final int MAX_LLIBRES_PRESTATS = 3;
	private List<Prestec> prestecs;

	// CONSTRUCTOR
	public GestorBiblioteca() {
		this.prestecs = new ArrayList<>();
	}

	// MÈTODES
	public boolean prestarLlibre(Usuari usuari, Llibre llibre) {
		if (usuari == null || llibre == null) {
			System.out.println("Usuari o llibre no vàlid.");
			return false;
		}

		if (llibre.esPrestat()) {
			System.out.println("Aquest llibre ja està prestat.");
			return false;
		}

		if (usuari.getLlibresPrestats().size() >= MAX_LLIBRES_PRESTATS) {
			System.out.println("L'usuari ja té el màxim de llibres prestats.");
			return false;
		}

		llibre.prestar();

		Prestec prestec = new Prestec(usuari, llibre, LocalDate.now());
		prestecs.add(prestec);

		usuari.afegirLlibre(llibre);

		System.out.println(usuari.getNom() + " ha agafat el llibre: " + llibre.getTitol());
		return true;
	}

	public boolean retornarLlibre(Usuari usuari, Llibre llibre) {
		if (usuari == null || llibre == null) {
			System.out.println("Usuari o llibre no vàlid.");
			return false;
		}

		Prestec prestecTrobat = null;

		for (Prestec prestec : prestecs) {
			if (prestec.getUsuari().equals(usuari) && prestec.getLlibre().equals(llibre)) {
				prestecTrobat = prestec;
				break;
			}
		}

		if (prestecTrobat == null) {
			System.out.println("No s'ha trobat cap préstec per aquest llibre i usuari.");
			return false;
		}

		llibre.retornar();
		usuari.retornarLlibre(llibre);
		prestecs.remove(prestecTrobat);

		System.out.println(usuari.getNom() + " ha retornat el llibre: " + llibre.getTitol());
		return true;
	}

	public void llistarPrestecs() {
	    if (prestecs.isEmpty()) {
	        System.out.println("No hi ha préstecs actius.");
	        return;
	    }

	    for (int i = 0; i < prestecs.size(); i++) {
	        System.out.println(prestecs.get(i));
	    }
	}

	// GETTERS
	public List<Prestec> getPrestecs() {
		return prestecs;
	}


}
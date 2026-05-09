import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GestorBiblioteca {

	// ATRIBUTS
<<<<<<< HEAD
	private static final int MAX_LLIBRES_PRESTATS = 3;
	private List<Prestec> prestecs;

	// CONSTRUCTOR
=======
	/**
	 * Int per desar el maxim de llibres que es poden prestar
	 */
	private static final int MAX_LLIBRES_PRESTATS = 3;
	/**
	 * Llista de prestecs
	 */
	private List<Prestec> prestecs;

	/**
	 * Constructor per crear el gestor de la biblioteca
	 */
>>>>>>> lluis
	public GestorBiblioteca() {
		this.prestecs = new ArrayList<>();
	}

	// MÈTODES
<<<<<<< HEAD
=======
	/**
	 * Funcio per prestar llibres
	 */
>>>>>>> lluis
	public boolean prestarLlibre(Usuari usuari, Llibre llibre) {
		if (usuari == null || llibre == null) {
			System.out.println("Usuari o llibre no vàlid.");
			return false;
		}

		if (llibre.getPrestat()) {
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

<<<<<<< HEAD
=======
	/**
	 * Funcio per retornar llibres
	 */
>>>>>>> lluis
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

<<<<<<< HEAD
=======
	/**
	 * metode per llistar els prestecs
	 */
>>>>>>> lluis
	public void llistarPrestecs() {
	    if (prestecs.isEmpty()) {
	        System.out.println("No hi ha préstecs actius.");
	        return;
	    }

	    for (int i = 0; i < prestecs.size(); i++) {
	        System.out.println(prestecs.get(i));
	    }
	}

<<<<<<< HEAD
	// GETTERS
=======
	/**
	 * Getter de llista de prestecs
	 */
>>>>>>> lluis
	public List<Prestec> getPrestecs() {
		return prestecs;
	}


}
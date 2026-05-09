import java.util.ArrayList;
import java.util.List;

public class Usuari {

    /*
        ATRIBUTS 
    */ 
    private String nom;
    private String dni; // Per si 2 usuaris tenen el matiex nom identificar-los 
    private List<Llibre> llibresPrestats;

    /*
        CONSTRUCTOR per crear l'usuari 
    */
    public Usuari(String nom, String dni) {
        this.nom = nom;
        this.dni = dni;
        this.llibresPrestats = new ArrayList<>();
    }

    // Getters
    public String getNom() {
        return nom;
    }

    public String getDni() {
        return dni;
    }

    public List<Llibre> getLlibresPrestats() {
        return llibresPrestats;
    }


    //Setters 
    public void setNom(String nom) { // Permet modificar l'usuari [cite: 51]
        this.nom = nom;
    }


    
    /*
        METODES 
    */
    /**
     * Metode per afegir llibres 
     */
    public void afegirLlibre(Llibre llibre) {
        if (!llibresPrestats.contains(llibre)) {
            llibresPrestats.add(llibre);
        }
    }
    /** 
     * Metode per quan l'usuari torna un llibre a la biblioteca
     */
    public void retornarLlibre(Llibre llibre) {
        llibresPrestats.remove(llibre);
    }

    /**
     * Mètode per mostrar la informació de l'usuari
     */
    @Override
    public String toString() {
        return "Usuari: " + nom + " (DNI: " + dni + ") - Llibres actuals: " + llibresPrestats.size();
    }
}
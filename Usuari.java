import java.util.ArrayList;
import java.util.List;

public class Usuari {
    //atributs
    private String nom;
    private List<Llibre> llibresPrestats;

    //Constructor
    public Usuari(String nom) {
        this.nom = nom;
        this.llibresPrestats = new ArrayList<>();
    }
    //Getters
    public String getNom() { 
        return nom; 
        }
    public List<Llibre> getLlibresPrestats() { 
        return llibresPrestats; 
        }

    //Metodes
    public void afegirLlibre(Llibre llibre) { 
        llibresPrestats.add(llibre); 
        }
    public void retornarLlibre(Llibre llibre) { 
        llibresPrestats.remove(llibre); 
        }
}
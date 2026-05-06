import java.util.ArrayList;
import java.util.List;
import java.text.Normalizer;

public class Biblioteca {
    // arraylist
    private List<Llibre> llibres;

    // constructor 
    public Bilbioteca(){
        this.biblioteca = new ArrayList();
    }

    // procediment afegir llibre, ja que no retorna res
    public void afegirLlibre(Llibre llibre){

        llibres.add(Llibre);
    }

    // Funció per eliminar el llibre pel títol
    public String eliminarLlibre(String titol) {
        // Busquem si el llibre existeix abans d'intentar esborrar
        Llibre llibreATreure = buscarLlibre(titol);
        
        if (llibreATreure != null) {
            llibres.remove(llibreATreure); // Aquí és on s'esborra l'objecte concret
            return "El llibre '" + titol + "' ha estat eliminat correctament.";
        } else {
            return "No s'ha trobat cap llibre amb el títol: " + titol;
        }
    }

    // funcio perquè si retorna
    public Llibre buscarLlibre(String titol){

        for(Llibre llibre : llibres){
            if(llibre.getTitol().equalsIgnoreCase(titol)){
                return llibre;
            }
        }

        return null;

    }

    // aqui busquem un llibre ignorant els accents.
    public Llibre buscarLlibreSenseAccents(String titol) {
        String titolNormalitzat = normalitzarText(titol);
        for (Llibre l : llibres) {
            if (normalitzarText(l.getTitol()).equals(titolNormalitzat)) {
                return l;
            }
        }
        return null;
    }

    public void llistarLlibres() {

        System.out.println("--- Inventari de la Biblioteca ---");

        for (Llibre l : llibres) {
            // Això cridarà al toString del llibre que ja inclou la categoria
            System.out.println(l.toString()); 

        }
    }

    pulbic List<Llibre> getLlibres(){
        return llibres;
    }

}
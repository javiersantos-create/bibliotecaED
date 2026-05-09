import java.util.ArrayList;
import java.util.List;
import java.text.Normalizer;

public class Biblioteca {
<<<<<<< HEAD
    // arraylist
    private List <Llibre> llibres;

    // constructor 
=======
    /**
     * Llista per desar els llibres de la biblioteca
     */
    private List <Llibre> llibres;

    /**
     * Constructor per crear la biblioteca
     */ 
>>>>>>> lluis
    public Biblioteca(){
        this.llibres = new ArrayList<>();
    }

<<<<<<< HEAD
    // procediment afegir llibre, ja que no retorna res
=======
    /**
     * procediment afegir llibre, ja que no retorna res
     */ 
>>>>>>> lluis
    public void afegirLlibre(Llibre llibre){

        llibres.add(llibre);
    }

<<<<<<< HEAD
    // Funció per eliminar el llibre pel títol
=======
    /**
     * Funció per eliminar el llibre pel títol
     */
>>>>>>> lluis
    public String eliminarLlibre(String titol,String autor) {
        // Busquem si el llibre existeix abans d'intentar esborrar
        Llibre llibreATreure = buscarLlibre(titol,autor);
        
        if (llibreATreure != null) {
            llibres.remove(llibreATreure); // Aquí és on s'esborra l'objecte concret
            return "El llibre '" + titol + "' ha estat eliminat correctament.";
        } else {
            return "No s'ha trobat cap llibre amb el títol: " + titol;
        }
    }

<<<<<<< HEAD
    // funcio perquè si retorna
=======
    /**
     * Funcio per buscar llibres
     */
>>>>>>> lluis
    public Llibre buscarLlibre(String titol,String autor){

        for(Llibre llibre : llibres){
            if(llibre.getTitol().equalsIgnoreCase(titol)){
                return llibre;
            }
        }

        return null;

    }

    public String normalitzarText(String text) {
        if (text == null) return "";

        String resultat = text.toLowerCase();
        
        // Sustituimos las vocales con acentos por vocales normales
        resultat = resultat.replace('á', 'a').replace('à', 'a');
        resultat = resultat.replace('é', 'e').replace('è', 'e');
        resultat = resultat.replace('í', 'i').replace('ï', 'i');
        resultat = resultat.replace('ó', 'o').replace('ò', 'o');
        resultat = resultat.replace('ú', 'u').replace('ü', 'u');
        resultat = resultat.replace('ç', 'c'); // ¡No nos olvidemos de la ce trencada!

        return resultat.trim(); // .trim() quita espacios vacíos al final
    }
    
<<<<<<< HEAD
=======
    /**
     * Funcio per llistar els llibres
     */
>>>>>>> lluis
    public void llistarLlibres() {

        System.out.println("--- Inventari de la Biblioteca ---");

        for (Llibre l : llibres) {
            // Això cridarà al toString del llibre que ja inclou la categoria
            System.out.println(l.toString()); 

        }
    }
<<<<<<< HEAD

=======
    /**
     *  Getter de llista de llires
     */
>>>>>>> lluis
    public List<Llibre> getLlibres(){
        return llibres;
    }

}
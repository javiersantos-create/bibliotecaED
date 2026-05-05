import java.util.ArrayList;
import java.util.List;

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

    // funcio perquè si retorna
    public Llibre buscarLlibre(String titol){

        for(Llibre llibre : llibres){
            if(llibre.getTitol().equalsIgnoreCase(titol)){
                return llibre;
            }
        }

        return null;

    }

    pulbic List<Llibre> getLlibres(){
        return llibres;
    }

}
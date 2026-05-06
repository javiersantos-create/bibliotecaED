import java.time.LocalDate;

public class Prestec {
	
	// ATRIBUTS
    private Usuari usuari;
    private Llibre llibre;
    private LocalDate dataPrestec;
    private LocalDate dataRetorn;
    
    // CONSTRUCTOR
    public Prestec(Usuari usuari, Llibre llibre, LocalDate dataPrestec) {
        this.usuari = usuari;
        this.llibre = llibre;
        this.dataPrestec = dataPrestec;
        this.dataRetorn = dataPrestec.plusWeeks(2);
    }
    
    // MÈTODES
    // Aquest mètode és per a saber si, comparant la data actual i la dataRetorn, està fora de termini o no
    public boolean estaForaDeTermini() {
        return LocalDate.now().isAfter(dataRetorn);
    }
    
    // GETTERS
    public Usuari getUsuari() {
        return usuari;
    }

    public Llibre getLlibre() {
        return llibre;
    }

    public LocalDate getDataPrestec() {
        return dataPrestec;
    }

    public LocalDate getDataRetorn() {
        return dataRetorn;
    }

    // TO STRING
    @Override
    public String toString() {
        return "Prestec{" + "usuari=" + usuari.getNom() + ", llibre=" + llibre.getTitol() + ", dataPrestec=" + dataPrestec + ", dataRetorn=" + dataRetorn + "}";
    }
}
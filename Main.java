import java.util.Scanner;
import java.util.List;

public class Main {
    /**
     * variable per llegir de teclat
    */
    public static Scanner teclat = new Scanner(System.in);

    /**
     * Creem la biblioteca i el gestor
     */
    public static Biblioteca biblioteca = new Biblioteca();
    public static GestorBiblioteca gestor = new GestorBiblioteca();
    
    /** 
     * Array list per guardar els users
     */ 
    private static java.util.List<Usuari> llistaUsuaris = new java.util.ArrayList<>();

    /**
     * Programa principal
     */
    public static void main(String[] args) {
<<<<<<< HEAD:Main.java
        Biblioteca biblioteca = new Biblioteca();

        Llibre llibre1 = new Llibre("1984","Novel·la", "George Orwell",false);
        Llibre llibre2 = new Llibre("El petit príncep","Històrica", "Antoine de Saint-Exupéry",false);

        biblioteca.afegirLlibre(llibre1);
        biblioteca.afegirLlibre(llibre2);

        Usuari usuari = new Usuari("Carla");
=======
    	
    	/**
    	 * Dades perque el programa tingui chicha
    	 */
    	//Creem alguns llibres
        Llibre l1 = new Llibre("1984", "Novel·la", "George Orwell", false);
        Llibre l2 = new Llibre("El Petit Príncep", "Infantil", "Antoine de Saint-Exupéry", false);
        Llibre l3 = new Llibre("Sapiens", "Ciència", "Yuval Noah Harari", false);
        Llibre l4 = new Llibre("La plaça del Diamant", "Novel·la", "Mercè Rodoreda", false);
>>>>>>> lluis:main.java
        
        // Afegim els llibres a la biblioteca
        biblioteca.afegirLlibre(l1);
        biblioteca.afegirLlibre(l2);
        biblioteca.afegirLlibre(l3);
        biblioteca.afegirLlibre(l4);

        // Creem  usuaris
        Usuari u1 = new Usuari("Carla", "12345678A");
        Usuari u2 = new Usuari("Joan", "87654321B");
        
        // Els afegim a la llista d'usuaris
        llistaUsuaris.add(u1);
        llistaUsuaris.add(u2);

        //Creem un préstec 
        // Carla agafa el llibre 1984
        gestor.prestarLlibre(u1, l1);
    	
    	
        //variable per sortir del bucle
        boolean sortir = false;

        /**
         * mentres l'usuari no selecciona sortir
         */
        while (!sortir) {
            // Cridem al mètode que mostra el menú complet
            mostrarMenu();
            String opcio = teclat.nextLine();

            //segons l'opccio que tria del menu fem la funcio indicada
            switch (opcio) {
                case "1": afegirLlibre(); break;
                case "2": llistarLlibres(); break;
                case "3": buscarLlibre(); break;
                case "4": afegirUsuari(); break;
                case "5": llistarUsuaris(); break;
                case "6": realitzarPrestec(); break;
                case "7": retornarLlibre(); break;
                case "8": llistarPrestecsActius(); break;
                case "0"://si tria la 0 mostrem per pantalla
                    System.out.println("programa tancat");
                    //sortir passa a ser true (sortim del bucle)
                    sortir = true;
                    break;
                default: //si no s'escull cap de les opccions indicades
                    System.out.println("Opció no vàlida, torna a provar.");
            }
        }
    }

    /**
     * Metode per mostrar el menu de que podem fer
     */
    public static void mostrarMenu() {
        System.out.println("\n--- GESTIÓ DE BIBLIOTECA ---");
        System.out.println("1. Afegir llibre");
        System.out.println("2. Llistar llibres");
        System.out.println("3. Buscar llibre");
        System.out.println("4. Afegir usuari");
        System.out.println("5. Llistar usuaris");
        System.out.println("6. Prestar llibre");
        System.out.println("7. Retornar llibre");
        System.out.println("8. Llistar préstecs actius");
        System.out.println("0. Sortir");
        System.out.print("Tria una opció: ");
    }

    /**
     * Metode per afegir llibres
     */
    public static void afegirLlibre() {
        //demanem les dades per afegir el llibre
        System.out.print("Títol: "); 
            String titol = teclat.nextLine();
        System.out.print("Categoria: ");
            String categoria = teclat.nextLine();
        System.out.print("Autor: "); 
            String autor = teclat.nextLine();
        //construim el llibre amb les dades introduides
        biblioteca.afegirLlibre(new Llibre(titol, categoria, autor, false));
        //mostrem per pantalla
        System.out.println("Llibre afegit correctament.");
    }

    /**
     * Metode per llistar els llibres
    */
    public static void llistarLlibres() {
        //cridem al funcio
        biblioteca.llistarLlibres();
    }

    /**
    * Metode per buscar llibres
    */
    private static void buscarLlibre() {
        //demanem titol per buscar el llibre i el desem a una variable
        System.out.print("Títol a buscar: ");
        String titol = teclat.nextLine();

        //demanem autor per buscar el llibre i el desem a una variable
        System.out.print("Autor a buscar: ");
        String autor = teclat.nextLine();

        //busquem el llibre
        Llibre l = biblioteca.buscarLlibre(titol, autor); 
        //si el llibre indicat no es null (esta)
        if (l != null){
            //mostrem ell llibre
            System.out.println("Trobat: " + l);
        } else{ //sino mostrem per pantalla
            System.out.println("Llibre no trobat.");
        }
    }

    /**
     * Metode per afegir usuaris a la biblioteca
     */
    public static void afegirUsuari() {
        //demanem nom i el desem a una variable
        System.out.print("Nom: "); 
            String nom = teclat.nextLine();
        //Demanem dni i el desem a una variable
        System.out.print("DNI: "); 
            String dni = teclat.nextLine();
        //afegim l'usuari a la llista i mmostrem per pantalla
        llistaUsuaris.add(new Usuari(nom, dni));
        System.out.println("Usuari registrat.");
    }

    /**
     * metode per llistar els usuaris de la biblioteca
     */
    public static void llistarUsuaris() {
        if (llistaUsuaris.isEmpty()) { //si la llista de users esta vuida
        //mostrem per pantalla
        System.out.println("No hi ha usuaris registrats.");
    }else{//si te usuari/s els mostrem 
        for (Usuari u : llistaUsuaris){
            System.out.println(u);
        } 
    }
    }

    /**
     * metode per fer el prestec d'un llibre
     */
    public static void realitzarPrestec() {
        //demanem el dni i el desem a una variable
        System.out.print("DNI de l'usuari: "); 
            String dni = teclat.nextLine();

        //Demanem el titol del llibre
        System.out.print("Títol del llibre: "); 
            String titol = teclat.nextLine();

        //busquem l'usuari i el llibre
        Usuari u = buscarUsuariPerDni(dni);
        Llibre l = biblioteca.buscarLlibre(titol, "");
        
        //si tots dos existeixen
        if (u != null && l != null) {
            //prestem el llibre
            gestor.prestarLlibre(u, l);
        } else {//sino mostrem
            System.out.println("Usuari o llibre no trobat.");
        }
    }

    /**
     * Metode per retornar el llibre  
     */ 
    public static void retornarLlibre() {
        //demanem dni al usuari i el desem a una variable
        System.out.print("DNI de l'usuari: "); 
            String dni = teclat.nextLine();

        //demanem titol i el desem a una variable
        System.out.print("Títol del llibre: ");     
            String titol = teclat.nextLine();
        //busquem usuari i llibre
        Usuari u = buscarUsuariPerDni(dni);
        Llibre l = biblioteca.buscarLlibre(titol, "");

        //si cap dels dos es null retornem el llibre
        if (u != null && l != null) {
            gestor.retornarLlibre(u, l);
        }
    }

    /**
     * Metode per llistar els prestec que hi ha actius
     */
    private static void llistarPrestecsActius() {
        gestor.llistarPrestecs();
    }

    /**
     * Funcio per buscar un usuari pel seu DNI
     * @param dni
     */
    public static Usuari buscarUsuariPerDni(String dni) {
        for (Usuari u : llistaUsuaris) {
            if (u.getDni().equalsIgnoreCase(dni)) {
            return u;
            }
        }
        return null;
    }
}
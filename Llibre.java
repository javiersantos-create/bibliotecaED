public class LLibre{

    // atributs encapsulats
        private String titol;
        private String categoria;
        private String autor;
        private boolean prestat;

    // constructor
        public LLibre(String titol,String categoria, String autor, boolean prestat){

            this.titol = titol;
            this.categoria = categoria;
            this.autor = autor;
            this.prestat = false; // per defecte sempre estarà disponible
            
        }

    // getters

        public String getTitol(){
            return titol;
        }

        public String getCategoria(){
            return categoria;
        }

        public String getAutor(){
            return autor;
        }

        public boolean getPrestat(){
            return prestat;
        }

        
    
    // procediments perquè no retorna res. 
        
        public void prestar(){
            prestat = true;
        }

        public void retornar(){
            prestat = false;
        }
    
    // toString

        @Override
        public String toString(){
            // retorna el titol del llibre + l'autor i si el llibre esta prestat sortira En préstec i si no esta prestat sortira disponible
            return "Titol: " + titol + " categoria: "+ categoria + " de " + autor + (prestat ? "(En préstec) " : "(Disponible)");
        }







}
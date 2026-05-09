public class Llibre{

    // atributs encapsulats
<<<<<<< HEAD
=======
    /**
     * Atributs per crear el llibre
     */
>>>>>>> lluis
        private String titol;
        private String categoria;
        private String autor;
        private boolean prestat;

<<<<<<< HEAD
    // constructor
=======
    /**
     * Contructor per crear el llibre
     */
>>>>>>> lluis
        public Llibre(String titol,String categoria, String autor, boolean prestat){

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
       
<<<<<<< HEAD
    // procediments perquè no retorna res. 
        
=======
    /**
     * Procedimen per prestar un llibre
     */
>>>>>>> lluis
        public void prestar(){
            prestat = true;
        }

        // setters per modificar
        
        public void setTitol(String titol) {
			this.titol = titol;
		}

		public void setCategoria(String categoria) {
			this.categoria = categoria;
		}

		public void setAutor(String autor) {
			this.autor = autor;
		}

		public void setPrestat(boolean prestat) {
			this.prestat = prestat;
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
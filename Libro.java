class Libro{
    String titulo, autor; //Atributos
    int isbn, numpag;
    Libro(){ //Metodo constructor vacio
    }
    Libro(String tit, String au, int is, int num){ //Metodo constructor  con atributos pasados por parametro
        System.out.println("titulo: " +tit+" autor: " +au+ "isbn " +is+ "numpag " +num);
    }
    //Metodo
    public void MostrarTitulo(){
        System.out.println("El titulo es: " + this.titulo);
    }
    //Metodo
    public void MostarAutor(){
        System.out.println("El autor es: " + this.autor);
    }
    //Metodo
    public void MostrarISBN(){
        System.out.println("El ISBN es: " + this.isbn);
    }
    //Metodo
    public void MostarNumeroDePaginas(){
        System.out.println("Numero de paginas: " + this.numpag);
    }
        
}
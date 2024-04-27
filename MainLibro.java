import java.util.Scanner; //Libreria
public class MainLibro { //Clase
    public static void main(String[] args) { //Metodo main
        Libro libro1 = new Libro(); //Crear objeto
        String a,e; //Declarando variables
        int i, o;
        
    
        Scanner op = new Scanner(System.in);
        System.out.print("Ingresa el Titulo del libro: "); //Pide datos al usuario
        a = op.next();
        System.out.print("Ingresa el nombre del Autor: ");
        e = op.next();
        System.out.print("Ingresa el ISBN: ");
        i = op.nextInt();
        System.out.print("Ingresa El numero de paginas: ");
        o = op.nextInt();

        libro1.titulo = a;
        libro1.autor = e;
        libro1.isbn = i;
        libro1.numpag = o;

        libro1.MostrarTitulo();
        libro1.MostarAutor();
        libro1.MostrarISBN();
        libro1.MostarNumeroDePaginas();
        Libro libro2 = new Libro("principito", "nishimura", 1999, 707); //Metodo constructor pasando parametros

    }
}
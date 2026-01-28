import java.util.Scanner;

public class GestionLibros {

    private Libros[] libros;
    private int contador;

    public GestionLibros() {
        libros = new Libros[20];
        contador = 0;

        libros[contador++] = new Libros("El Quijote", "Cervantes");
        libros[contador++] = new Libros("1984", "George Orwell");
        libros[contador++]= new Libros("El Principito", "Antonie de Saint-Exupéry");
        libros[contador++] = new Libros("Berserk", "Kentaro Miura");
        libros[contador++] = new Libros("El lazarillo de tomes", "Anónimo");
        libros[contador++] = new Libros("Harry Potter", "J.K. Roulling");

    }

    public void agregarLibro() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Título: ");
        String titulo = sc.nextLine();
        System.out.print("Autor: ");
        String autor = sc.nextLine();

        libros[contador++] = new Libros(titulo, autor);
        System.out.println("Libro añadido correctamente.");
    }

    public void mostrarLibros() {
        for (int i = 0; i < contador; i++) {
            System.out.println(libros[i].getId() + " - " +
                               libros[i].getTitulo() + " (" +
                               libros[i].getAutor() + ")");
        }
    }

    public Libros buscarLibroPorId(int id) {
        for (int i = 0; i < contador; i++) {
            if (libros[i].getId() == id) {
                return libros[i];
            }
        }
        return null;
    }
}


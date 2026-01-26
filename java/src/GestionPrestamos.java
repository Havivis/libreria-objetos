import java.util.Scanner;

public class GestionPrestamos {

    private Prestamo[] prestamos;
    private int contador;

    public GestionPrestamos() {
        prestamos = new Prestamo[20];
        contador = 0;
    }

    public void prestarLibro(Libros libro, Usuarios usuario) {
        prestamos[contador++] = new Prestamo(libro, usuario);
        System.out.println("Libro prestado correctamente.");
    }

    public void devolverLibro(int idLibro) {
        for (int i = 0; i < contador; i++) {
            if (prestamos[i].getLibro().getId() == idLibro && prestamos[i].isActivo()) {
                prestamos[i].devolver();
                System.out.println("Libro devuelto.");
                return;
            }
        }
        System.out.println("No se encontró el préstamo.");
    }

    public void mostrarPrestamosActivos() {
        for (int i = 0; i < contador; i++) {
            if (prestamos[i].isActivo()) {
                System.out.println(
                    prestamos[i].getLibro().getTitulo() +
                    " → " +
                    prestamos[i].getUsuario().getNombre()
                );
            }
        }
    }
}

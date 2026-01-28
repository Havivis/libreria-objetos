//@author Paco Zahinos Duarte.
//@author Javier Rivera Delgado.
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        GestionUsuarios gestionUsuarios = new GestionUsuarios();
        GestionLibros gestionLibros = new GestionLibros();
        GestionPrestamos gestionPrestamos = new GestionPrestamos();

        System.out.println("=== LOGIN ===");
        System.out.print("Usuario: ");
        String nombre = sc.nextLine();
        System.out.print("Contraseña: ");
        String pass = sc.nextLine();

        Usuarios usuario = gestionUsuarios.login(nombre, pass);

        if (usuario == null) {
            System.out.println("Login incorrecto");
            return;
        }

        int opcion;
        do {
            System.out.println("\nMENÚ");
            System.out.println("1. Mostrar libros");
            System.out.println("2. Prestar libro");
            System.out.println("3. Devolver libro");

            if (usuario.getRol().equals("ADMIN")) {
                System.out.println("4. Añadir libro");
                System.out.println("5. Ver usuarios");
            }

            System.out.println("0. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> gestionLibros.mostrarLibros();
                case 2 -> {
                    System.out.print("ID libro: ");
                    int id = sc.nextInt();
                    Libros libro = gestionLibros.buscarLibroPorId(id);
                    if (libro != null)
                        gestionPrestamos.prestarLibro(libro, usuario);
                }
                case 3 -> {
                    System.out.print("ID libro: ");
                    int id = sc.nextInt();
                    gestionPrestamos.devolverLibro(id);
                }
                case 4 -> {
                    if (usuario.getRol().equals("ADMIN"))
                        gestionLibros.agregarLibro();
                }
                case 5 -> {
                    if (usuario.getRol().equals("ADMIN"))
                        gestionUsuarios.mostrarUsuarios();
                }
            }

        } while (opcion != 0);
    }
}

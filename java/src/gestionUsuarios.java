import java.util.Scanner;

public class GestionUsuarios {

    private Usuarios[] usuarios;
    private int contadorUsuarios;

    public GestionUsuarios() {
        usuarios = new Usuarios[10]; 
        contadorUsuarios = 0;

        // Usuarios de prueba
        usuarios[contadorUsuarios++] = new Usuarios("admin", "admin123", "ADMIN");
        usuarios[contadorUsuarios++] = new Usuarios("juan", "1234", "USER");
    }

    // Registrar usuario (ADMIN)
    public void registrarUsuario() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre de usuario: ");
        String nombre = sc.nextLine();

        System.out.print("Contraseña: ");
        String password = sc.nextLine();

        System.out.print("Rol (ADMIN / USER): ");
        String rol = sc.nextLine().toUpperCase();

        usuarios[contadorUsuarios++] = new Usuarios(nombre, password, rol);
        System.out.println("Usuario registrado correctamente.");
    }

    // Mostrar usuarios (ADMIN)
    public void mostrarUsuarios() {
        System.out.println("Lista de usuarios:");
        for (int i = 0; i < contadorUsuarios; i++) {
            System.out.println(usuarios[i]);
        }
    }

    // Login
    public Usuarios login(String nombre, String password) {
        for (int i = 0; i < contadorUsuarios; i++) {
            if (usuarios[i].getNombre().equals(nombre) &&
                usuarios[i].getPassword().equals(password)) {
                return usuarios[i];
            }
        }
        return null;
    }
}

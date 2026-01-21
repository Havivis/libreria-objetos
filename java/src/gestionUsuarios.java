 import java.util.Scanner;
public class gestionUsuarios {
   


    private static Usuario[] usuarios = new Usuario[10];
    private static int totalUsuarios = 0;

    public static void registrarUsuario(Usuario admin) {
        if (!admin.getRol().equals("ADMIN")) {
            System.out.println("Acceso denegado. Solo administradores.");
            return;
        }

        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre de usuario: ");
        String nombre = sc.nextLine();

        System.out.print("Contraseña: ");
        String password = sc.nextLine();

        System.out.print("Rol (ADMIN / USUARIO): ");
        String rol = sc.nextLine().toUpperCase();

        usuarios[totalUsuarios] = new Usuario(nombre, password, rol);
        totalUsuarios++;

        System.out.println("Usuario registrado correctamente.");
    }

    // Mostrar usuarios registrados (ADMIN)
    public static void mostrarUsuarios(Usuario admin) {
        if (!admin.getRol().equals("ADMIN")) {
            System.out.println("Acceso denegado. Solo administradores.");
            return;
        }

        System.out.println("Listado de usuarios:");
        for (int i = 0; i < totalUsuarios; i++) {
            System.out.println(usuarios[i]);
        }
    }
}



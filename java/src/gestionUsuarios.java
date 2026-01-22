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
    }

}
    public static void listarUsuarios(Usuario admin) {
        if (!admin.getRol().equals("ADMIN")) {
            System.out.println("Acceso denegado. Solo administradores.");
            return;
        }

        if (totalUsuarios == 0) {
            System.out.println("No hay usuarios registrados.");
            return;
        }

        System.out.println("Usuarios registrados:");
        for (int i = 0; i < totalUsuarios; i++) {
            System.out.println(usuarios[i]);
        }
    }
    
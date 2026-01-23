import java.util.Scanner;

public class GestionUsuarios {

    private Usuarios[] usuarios;
    private int contadorUsuarios;

    public GestionUsuarios() {
        usuarios = new Usuarios[10]; 
        contadorUsuarios = 0;

        
        usuarios[contadorUsuarios++] = new Usuarios("admin", "admin123", "ADMIN");
        usuarios[contadorUsuarios++] = new Usuarios("Amador", "1234", "USER");
    }

    
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

    
    public void mostrarUsuarios() {
        System.out.println("Lista de usuarios:");
        for (int i = 0; i < contadorUsuarios; i++) {
            System.out.println(usuarios[i]);
        }
    }

    
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



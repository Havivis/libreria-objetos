//@author Paco Zahinos Duarte
//@author Javier Rivera Delgad
public class Usuarios {

    private String nombre;
    private String password;
    private String rol; 

    public Usuarios(String nombre, String password, String rol) {
        this.nombre = nombre;
        this.password = password;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRol() {
        return rol;
    }

    @Override
    public String toString() {
        return "Usuario: " + nombre + " | Rol: " + rol;
    }
}
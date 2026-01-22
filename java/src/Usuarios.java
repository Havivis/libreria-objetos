//@author Paco Zahinos Duarte
//@author Javier Rivera Delgado
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getRol() {
        return rol;
    }

    @Override
    public String toString() {
        return "Usuario: " + nombre + " | Rol: " + rol;
    }

}
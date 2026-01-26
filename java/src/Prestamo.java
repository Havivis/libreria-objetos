public class Prestamo {
    private Libros libro;
    private Usuarios usuario;
    private boolean activo;

    public Prestamo(Libros libro, Usuarios usuario) {
        this.libro = libro;
        this.usuario = usuario;
        this.activo = true;
    }

    public Libros getLibro() {
        return libro;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public boolean isActivo() {
        return activo;
    }

    public void devolver() {
        activo = false;
    }
}

import java.util.Random;

public class Libros {
    private String titulo;
    private String autor;
    private int id;

    public Libros(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.id = generadId();
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getId() {
        return id;
    }
    private int generadId(){
        Random rd = new Random();
        id = rd.nextInt(1000,9000);
        return id;
    }
}

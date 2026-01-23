import java.util.Random;

public class Libros {
    private String titulo;
    private String autor;
    private int id;

    

    private int generadId(){
        Random rd = new Random();
        id = rd.nextInt(1000,9000);
        return id;
    }
}

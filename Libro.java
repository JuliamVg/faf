public class Libro {
    
    private String titulo;
    private String autor;
    private int añoPublicacion;
    private double precio;

    public Libro(String titulo, String autor, int añoPublicacion, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public double getPrecio() {
        return precio;
    }
}

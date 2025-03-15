public class Pmain {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.ingresarLibros();
        Libro libroMasCostoso = biblioteca.encontrarLibroMasCostoso();
        biblioteca.mostrarLibroMasCostoso(libroMasCostoso);
    }
}

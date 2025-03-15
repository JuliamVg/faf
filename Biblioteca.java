import java.util.Scanner;

public class Biblioteca {
    private Libro[][] libros;
    private int cantidadLibros;

    public void ingresarLibros() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de libros a evaluar: ");
        cantidadLibros = sc.nextInt();
        sc.nextLine(); 

        libros = new Libro[cantidadLibros][1]; 

        for (int i = 0; i < cantidadLibros; i++) {
            System.out.println("\nIngrese los datos del libro " + (i + 1) + ":");

            System.out.print("Título: ");
            String titulo = sc.nextLine();

            System.out.print("Autor: ");
            String autor = sc.nextLine();

            System.out.print("Año de publicación: ");
            int añoPublicacion = sc.nextInt();

            System.out.print("Precio: ");
            double precio = sc.nextDouble();
            sc.nextLine(); // Consumir la línea vacía

            libros[i][0] = new Libro(titulo, autor, añoPublicacion, precio);
        }
    }

    public Libro encontrarLibroMasCostoso() {
        Libro libroMasCostoso = libros[0][0];

        for (int i = 1; i < cantidadLibros; i++) {
            if (libros[i][0].getPrecio() > libroMasCostoso.getPrecio()) {
                libroMasCostoso = libros[i][0];
            }
        }
        return libroMasCostoso;
    }

    public void mostrarLibroMasCostoso(Libro libro) {
        System.out.println("\n📚 El libro más costoso es:");
        System.out.println("Título: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Año de publicación: " + libro.getAñoPublicacion());
        System.out.println("Precio: $" + libro.getPrecio());
    }
}

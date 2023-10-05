/**
 * La clase Principal
 * <p>
 * Se importa la clase LinkedList necesaria para almacenar los libros.
 */
import java.util.LinkedList;

public class Principal {
    /**
     * Método inicial que es ejecutado
     * @param args
     * Complejidad temporal: O(1) Tiempo constante.
     */

    public static void main(String[] args) {

        Biblioteca bibliotecaKonradLorenz = new Biblioteca();
        Libro cienanos = new Libro("Cien años de soledad", "Gabriel García Márquez",496 );
        Libro coddavin = new Libro("El código Da Vinci", "Dan Brown", 656);
        Libro milnueve = new Libro("1984","George Orwell", 326);
        Libro hobbit = new Libro ("El Hobbit", "J.R.R. Tolkien", 310);
        Libro odisea = new Libro ("La Odisea", "Homero", 448);
        /**
         * Metodo para guardar los libros dentro de la lista de librosDisponibles.
         *
         */
        bibliotecaKonradLorenz.registrarLibro (cienanos);
        bibliotecaKonradLorenz.registrarLibro (coddavin);
        bibliotecaKonradLorenz.registrarLibro (milnueve);
        bibliotecaKonradLorenz.registrarLibro (hobbit);
        bibliotecaKonradLorenz.registrarLibro (odisea);
        /**
         * Metodo para buscar el nombre de algunos nombres de libros por titulo dentro de la lista librosDisponibles .
         *
         */
        System.out.println();
        System.out.println(bibliotecaKonradLorenz.buscarLibro("Cien años de soledad"));
        System.out.println(bibliotecaKonradLorenz.buscarLibro("Dioses del Olimpo"));
        System.out.println(bibliotecaKonradLorenz.buscarLibro("La Odisea"));
        /**
         * Metodo para imprimir todos los libros guardados dentro de la lista librosDisponibles.
         *
         * Complejidad lineal: O(N) Tiempo lineal.
         */
        System.out.println("\nLos libros disponibles son: ");
        LinkedList<Libro> librosDisponibles = bibliotecaKonradLorenz.mostrarLibrosDisponibles();
        for (Libro libro : librosDisponibles) {
            System.out.println(libro.getTitulo());
        }
    }
}
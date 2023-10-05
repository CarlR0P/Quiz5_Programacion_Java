/**
 * La clase Biblioteca
 * <p>
 * Se importa la clase LinkedList necesaria para almacenar los libros.
 */
import java.util.LinkedList;
/**************************************/
/************* Atributos **************/
/**************************************/
public class Biblioteca {
    public LinkedList<Libro> librosDisponibles;
    /**
     * CONSTRUCTOR DE LA CLASE
     * Para inicializar la lista de librosDisponibles.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public Biblioteca () {

        this.librosDisponibles = new LinkedList<>();
    }
    /**
     * Metodo que permite guardar los libros en la lista librosDisponibles.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public void registrarLibro(Libro libro) {

        librosDisponibles.add(libro);
    }
    /**
     * Metodo que permite buscar un libro por el titulo dentro de la lista librosDisponibles.
     * Mostrara un mensaje de acuerdo a la disponibilidad del libro
     *
     * Complejidad lineal: O(N) Tiempo lineal.
     */
    public String buscarLibro(String titulo) {

        Libro libro = null;
        for (int i = 0; i < librosDisponibles.size(); i++) {
            libro = librosDisponibles.get(i);
            if (libro.getTitulo().equals(titulo)) {
                return "El libro " + titulo + " está disponible en la biblioteca.";
            }
        }
        return "El libro " + titulo + " NO está disponible en la biblioteca." ;
    }
    /**
     * Metodo que permite mostrar todos los libros guardados dentro de la lista de librosDisponibles.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public LinkedList<Libro> mostrarLibrosDisponibles () {

        return librosDisponibles;
    }
}
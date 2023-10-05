/**
 * La clase Biblioteca
 */
public class Libro {
/**************************************/
/************* Atributos **************/
    /**************************************/
    private String titulo = "";
    private String autor = "";
    private int numeroPaginas = 0;
    /**
     * CONSTRUCTOR DE LA CLASE
     * @param titulo Para el titulo del libro.
     * @param autor Para el autor del libro.
     * @param numeroPaginas Para el numero de paginas del libro.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public Libro (String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }
    /**
     * Metodo que permite modificar la variable del titulo de un libro.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public void setTitulo (String titulo) {
        this.titulo = titulo;
    }
    /**
     * Metodo que permite modificar la variable del autor de un libro.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public void setAutor (String autor) {
        this.autor = autor;
    }
    /**
     * Metodo que permite modificar la variable del numero de paginas de un libro.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public void setNumeroPaginas (int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    /**
     * Metodo que permite obtener la variable del titulo de un libro.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public String getTitulo() {
        return titulo;
    }
    /**
     * Metodo que permite obtener la variable del autor de un libro.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public String getAutor () {
        return autor;
        /**
         * Metodo que permite obtener la variable del numero de paginas de un libro.
         *
         * Complejidad temporal: O(1) Tiempo constante.
         */
    }
    public int getNumeroPaginas() {

        return numeroPaginas;
    }
}
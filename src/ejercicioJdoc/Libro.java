package ejercicioJdoc;

/**
 * Clase que representa un libro.
 */
public class Libro {

    /**
     * Título del libro.
     */
    private String titulo;

    /**
     * Autor del libro.
     */
    private String autor;

    /**
     * Año de publicación del libro.
     */
    private int añoPublicacion;

    /**
     * Constructor de la clase Libro.
     *
     * @param titulo          Título del libro.
     * @param autor           Autor del libro.
     * @param añoPublicacion  Año de publicación del libro.
     */
    public Libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
    }

    /**
     * Obtiene el título del libro.
     *
     * @return Título del libro.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Establece el título del libro.
     *
     * @param titulo Nuevo título del libro.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtiene el autor del libro.
     *
     * @return Autor del libro.
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Establece el autor del libro.
     *
     * @param autor Nuevo autor del libro.
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Obtiene el año de publicación del libro.
     *
     * @return Año de publicación del libro.
     */
    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    /**
     * Establece el año de publicación del libro.
     *
     * @param añoPublicacion Nuevo año de publicación del libro.
     */
    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    /**
     * Imprime información sobre el libro.
     */
    public void imprimirInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de Publicación: " + añoPublicacion);
    }
}

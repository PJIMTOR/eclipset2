package ejercicioJdoc;

/**
 * Clase que representa a un estudiante.
 */
public class Estudiante {

    /**
     * Nombre del estudiante.
     */
    private String nombre;

    /**
     * Edad del estudiante.
     */
    private int edad;

    /**
     * Calificaciones del estudiante.
     */
    private double[] calificaciones;

    /**
     * Constructor de la clase Estudiante.
     *
     * @param nombre Nombre del estudiante.
     * @param edad   Edad del estudiante.
     */
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificaciones = new double[5]; // Suponemos 5 asignaturas
    }

    /**
     * Obtiene el nombre del estudiante.
     *
     * @return Nombre del estudiante.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del estudiante.
     *
     * @param nombre Nuevo nombre del estudiante.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la edad del estudiante.
     *
     * @return Edad del estudiante.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad del estudiante.
     *
     * @param edad Nueva edad del estudiante.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Obtiene las calificaciones del estudiante.
     *
     * @return Calificaciones del estudiante.
     */
    public double[] getCalificaciones() {
        return calificaciones;
    }

    /**
     * Establece las calificaciones del estudiante.
     *
     * @param calificaciones Nuevas calificaciones del estudiante.
     */
    public void setCalificaciones(double[] calificaciones) {
        this.calificaciones = calificaciones;
    }
}

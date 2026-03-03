
public class DVD extends Material implements Prestable {

    private double duracion;
    private boolean prestado = false;

    public DVD(String codigo, String titulo, int anio,
               Persona director, double duracion) {
        super(codigo, titulo, anio, director);
        this.duracion = duracion;
    }


    public void prestar() {
        if (!prestado) {
            prestado = true;
            System.out.println("DVD prestado correctamente.");
        } else {
            System.out.println("El DVD ya está prestado.");
        }
    }


    public void devolver() {
        if (prestado) {
            prestado = false;
            System.out.println("DVD devuelto correctamente.");
        }
    }


    public boolean isPrestado() {
        return prestado;
    }


    public void mostrarDetalles() {
        System.out.println("----- DVD -----");
        System.out.println("Código: " + getCodigo());
        System.out.println("Título: " + getTitulo());
        System.out.println("Año: " + getAnio());
        System.out.println("Director: " + getResponsable().getNombre());
        System.out.println("Nacionalidad: " + getResponsable().getNacionalidad());
        System.out.println("Duración: " + duracion + " minutos");
        System.out.println("Prestado: " + (prestado ? "Sí" : "No"));
    }
}

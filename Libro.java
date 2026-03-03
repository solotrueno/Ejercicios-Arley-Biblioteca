
public class Libro extends Material implements Prestable {

    private int numeroPaginas;
    private boolean prestado = false; // Inicia en false

    public Libro(String codigo, String titulo, int anio,
                 Persona autor, int numeroPaginas) {
        super(codigo, titulo, anio, autor);
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public void prestar() {
        if (!prestado) {
            prestado = true;
            System.out.println("Libro prestado correctamente.");
        } else {
            System.out.println("El libro ya está prestado.");
        }
    }

    @Override
    public void devolver() {
        if (prestado) {
            prestado = false;
            System.out.println("Libro devuelto correctamente.");
        }
    }

    @Override
    public boolean isPrestado() {
        return prestado;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("----- LIBRO -----");
        System.out.println("Código: " + getCodigo());
        System.out.println("Título: " + getTitulo());
        System.out.println("Año: " + getAnio());
        System.out.println("Autor: " + getResponsable().getNombre());
        System.out.println("Nacionalidad: " + getResponsable().getNacionalidad());
        System.out.println("Número de páginas: " + numeroPaginas);
        System.out.println("Prestado: " + (prestado ? "Sí" : "No"));
    }
}

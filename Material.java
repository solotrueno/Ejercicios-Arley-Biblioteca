
public abstract class Material {

    private String codigo;
    private String titulo;
    private int anio;
    private Persona responsable; // Autor o Director


    public Material(String codigo, String titulo, int anio, Persona responsable) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anio = anio;
        this.responsable = responsable;
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Persona getResponsable() {
        return responsable;
    }

    public void setResponsable(Persona responsable) {
        this.responsable = responsable;
    }


    public abstract void mostrarDetalles();
}

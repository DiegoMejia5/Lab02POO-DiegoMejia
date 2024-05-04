public class Pelicula {
    private String titulo;
    private String descripcion;
    private String duracion;

    public Pelicula(String titulo, String descripcion, String duracion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
}

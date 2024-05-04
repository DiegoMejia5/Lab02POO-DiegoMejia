public class Entrada {
    private Cliente cliente;
    private Pelicula pelicula;
    private int numeroAsiento;

    public Entrada(Cliente cliente, Pelicula pelicula, int numeroAsiento) {
        this.cliente = cliente;
        this.pelicula = pelicula;
        this.numeroAsiento = numeroAsiento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }
}

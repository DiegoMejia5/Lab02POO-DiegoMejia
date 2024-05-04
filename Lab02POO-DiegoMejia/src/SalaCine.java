import java.util.ArrayList;
import java.util.List;

public class SalaCine {
    private List<Entrada> entradas;

    public SalaCine() {
        this.entradas = new ArrayList<>();
    }

    public void venderEntrada(Entrada entrada) {
        entradas.add(entrada);
    }

    public List<Entrada> getEntradas() {
        return entradas;
    }

    public boolean esAsientoOcupado(int numeroAsiento) {
        for (Entrada entrada : entradas) {
            if (entrada.getNumeroAsiento() == numeroAsiento) {
                return true;
            }
        }
        return false;
    }
}


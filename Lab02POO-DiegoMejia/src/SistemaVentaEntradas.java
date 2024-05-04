import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaVentaEntradas {
    private SalaCine salaCine;
    private List<Pelicula> peliculasDisponibles;

    public SistemaVentaEntradas() {
        this.salaCine = new SalaCine();
        this.peliculasDisponibles = new ArrayList<>();
        this.peliculasDisponibles.add(new Pelicula("Gigantes de Acero", "Accion", "2 horas"));
        this.peliculasDisponibles.add(new Pelicula("El conjuro 3", "Terror", "3 horas"));
        this.peliculasDisponibles.add(new Pelicula("Matrix", "Ciencia ficcion", "2 horas"));
    }

    public List<Pelicula> getPeliculasDisponibles() {
        return peliculasDisponibles;
    }

    public void comprarEntrada(Scanner scanner) {
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su telefono: ");
        String telefono = scanner.nextLine();
        Cliente cliente = new Cliente(nombre, telefono);

        System.out.println("Peliculas disponibles:");
        for (int i = 0; i < peliculasDisponibles.size(); i++) {
            System.out.println((i + 1) + ". " + peliculasDisponibles.get(i).getTitulo());
        }

        System.out.print("Seleccione una pelicula: ");
        int opcionPelicula = scanner.nextInt();
        scanner.nextLine();

        Pelicula peliculaSeleccionada = peliculasDisponibles.get(opcionPelicula - 1);

        System.out.print("Ingrese el numero de asiento: ");
        int numeroAsiento = scanner.nextInt();
        scanner.nextLine();

        if (!salaCine.esAsientoOcupado(numeroAsiento)) {
            Entrada entrada = new Entrada(cliente, peliculaSeleccionada, numeroAsiento);
            salaCine.venderEntrada(entrada);
            System.out.println("¡Entrada comprada con exito!");
        } else {
            System.out.println("Lo siento, ese asiento ya esta ocupado. ¿Desea comprar en otro asiento? (S/N)");
            String opcion = scanner.nextLine().toUpperCase();
            if (opcion.equals("S")) {
                comprarEntrada(scanner);
            } else {
                System.out.println("Volviendo al menu principal...");
            }
        }
    }

    public void verEntradas() {
        List<Entrada> entradas = salaCine.getEntradas();
        if (entradas.isEmpty()) {
            System.out.println("No hay entradas vendidas.");
        } else {
            System.out.println("Entradas vendidas:");
            for (Entrada entrada : entradas) {
                System.out.println("Cliente: " + entrada.getCliente().getNombre() +
                        ", Pelicula: " + entrada.getPelicula().getTitulo() +
                        ", Asiento: " + entrada.getNumeroAsiento());
            }
        }
    }
}

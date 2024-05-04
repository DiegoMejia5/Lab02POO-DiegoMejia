import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaVentaEntradas sistemaVentaEntradas = new SistemaVentaEntradas();

        int opcion;
        do {
            System.out.println("Bienvenido a CINEMOSCA");
            System.out.println("1. Comprar entrada");
            System.out.println("2. Ver entradas vendidas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    sistemaVentaEntradas.comprarEntrada(scanner);
                    break;
                case 2:
                    sistemaVentaEntradas.verEntradas();
                    break;
                case 3:
                    System.out.println("Gracias por visitar a CINEMOSCA, hasta luego!");
                    break;
                default:
                    System.out.println("Opcion invalida. Por favor, seleccione una opcion valida.");
            }
        } while (opcion != 3);
    }
}



import java.util.InputMismatchException;
import java.util.Scanner;

public class EjemploMain {
    private static BinarySearchTree<String, Automovil> binarySearchTree = new BinarySearchTree<>(new AutomovilComparator());
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String opcion;
        do {
            System.out.println("\nMENU");
            System.out.println("1. Registrar Automovil");
            System.out.println("2. Buscar Automovil por Placa");
            System.out.println("3. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    registrarAutomovil();
                    break;
                case "2":
                    buscarAutomovil();
                    break;
                case "3":
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (!opcion.equals("3"));
    }

    private static void registrarAutomovil() {
        System.out.print("Ingrese marca: ");
        String marca = scanner.nextLine();
        
        int modelo = leerEntero("Ingrese modelo (año): ");
        String linea = leerLinea("Ingrese línea: ");
        double precio = leerDouble("Ingrese precio: ");
        String placa = leerLinea("Ingrese placa: ");

        Automovil automovil = new Automovil(marca, modelo, linea, precio, placa);
        binarySearchTree.insert(placa, automovil);
        System.out.println("Automovil registrado con éxito.");
    }

    private static void buscarAutomovil() {
        System.out.print("Ingrese placa del automovil a buscar: ");
        String placa = scanner.nextLine();
        Automovil automovil = binarySearchTree.find(placa);
        if (automovil != null) {
            System.out.println("Automovil encontrado: " + automovil);
        } else {
            System.out.println("Automovil no encontrado.");
        }
    }

    private static int leerEntero(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                int valor = scanner.nextInt();
                scanner.nextLine(); // Consume newline left-over
                return valor;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
                scanner.nextLine(); // Consume the invalid input
            }
        }
    }

    private static double leerDouble(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                double valor = scanner.nextDouble();
                scanner.nextLine(); // Consume newline left-over
                return valor;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
                scanner.nextLine(); // Consume the invalid input
            }
        }
    }

    private static String leerLinea(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }
}

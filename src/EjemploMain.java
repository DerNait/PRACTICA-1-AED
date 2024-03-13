import java.util.Scanner;

public class EjemploMain {
    private static BinarySearchTree<String, Automovil> binarySearchTree = new BinarySearchTree<>(new AutomovilComparator());
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\nMENU");
            System.out.println("1. Registrar Automovil");
            System.out.println("2. Buscar Automovil por Placa");
            System.out.println("3. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (opcion) {
                case 1:
                    registrarAutomovil();
                    break;
                case 2:
                    buscarAutomovil();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 3);
    }

    private static void registrarAutomovil() {
        System.out.print("Ingrese marca: ");
        String marca = scanner.nextLine();
        System.out.print("Ingrese modelo (año): ");
        int modelo = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        System.out.print("Ingrese línea: ");
        String linea = scanner.nextLine();
        System.out.print("Ingrese precio: ");
        double precio = scanner.nextDouble();
        scanner.nextLine(); // Consume newline left-over
        System.out.print("Ingrese placa: ");
        String placa = scanner.nextLine();

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
}

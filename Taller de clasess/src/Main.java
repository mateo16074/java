
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("¡Bienvenido al zoológico!");


        System.out.println("¿Cuál es el nombre del animal?");
        String nombre = scanner.nextLine();


        System.out.println("¿Cuál es la edad del animal?");
        int edad = scanner.nextInt();

        /
        System.out.println("¿Qué acción deseas realizar? (darDeComer, acariciar, jugar)");
        String accion = scanner.next();

        // Crear el animal
        if (nombre.equals("perro")) {
            Perro perro = new Perro(nombre, edad);
        } else if (nombre.equals("gato")) {
            Gato gato = new Gato(nombre, edad);
        } else if (nombre.equals("lagarto")) {
            Lagarto lagarto = new Lagarto(nombre, edad);
        }

        if (accion.equals("darDeComer")) {
            perro.darDeComer();
        } else if (accion.equals("acariciar")) {
            perro.acariciar();
        } else if (accion.equals("jugar")) {
            perro.jugar();
        } else {
            System.out.println("Acción no válida");
            return;
        }
    }
}
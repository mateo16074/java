// Superclase Animales
class Animales {

    protected String nombre;
    protected int edad;

    public Animales(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void darDeComer() {
        System.out.println("Dando de comer a " + this.nombre);
    }

    public void acariciar() {
        System.out.println("Acariciando a " + this.nombre);
    }

    public void jugar() {
        System.out.println("Jugando con " + this.nombre);
    }
}

// Subclase Perro
class Perro extends Animales {

    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    public void ladrar() {
        System.out.println("El perro " + this.nombre + " ladra");
    }
}

// Subclase Gato
class Gato extends Animales {

    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    public void ronronear() {
        System.out.println("El gato " + this.nombre + " ronronea");
    }
}

// Subclase Lagarto
class Lagarto extends Animales {

    public Lagarto(String nombre, int edad) {
        super(nombre, edad);
    }

    public void huir() {
        System.out.println("El lagarto " + this.nombre + " huye");
    }

    // Programa principal
    public class Main {

        public static void main(String[] args) {

            // Crear un Scanner para leer la entrada del usuario
            Scanner scanner = new Scanner(System.in);

            // Imprimir un mensaje de bienvenida
            System.out.println("¡Bienvenido al zoológico!");

            // Leer el nombre del animal
            System.out.println("¿Cuál es el nombre del animal?");
            String nombre = scanner.nextLine();

            // Leer la edad del animal
            System.out.println("¿Cuál es la edad del animal?");
            int edad = scanner.nextInt();

            // Leer la acción que se desea realizar
            System.out.println("¿Qué acción deseas realizar? (darDeComer, acariciar, jugar)");
            String accion = scanner.next();

            // Crear el animal
            Animales animal = null;
            if (nombre.equals("perro")) {
                animal = new Perro(nombre, edad);
            } else if (nombre.equals("gato")) {
                animal = new Gato(nombre, edad);
            } else if (nombre.equals("lagarto")) {
                animal = new Lagarto(nombre, edad);
            } else {
                System.out.println("Animal no válido");
                return;
            }

            // Realizar la acción
            if (accion.equals("darDeComer")) {
                animal.darDeComer();
            } else if (accion.equals("acariciar")) {
                animal.acariciar();
            } else if (accion.equals("jugar")) {
                animal.jugar();
            } else {
                System.out.println("Acción no válida");
                return;
            }
        }
    }

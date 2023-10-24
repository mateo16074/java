public class Animales {
    protected String nombre;
    protected int edad;

    public Animales(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void darDeComer() {
        System.out.println("Alimentando a " + this.nombre);
    }

    public void acariciar() {
        System.out.println("Acariciando a " + this.nombre);
    }

    public void jugar() {
        System.out.println("Jugando con " + this.nombre);
    }
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
    }
}


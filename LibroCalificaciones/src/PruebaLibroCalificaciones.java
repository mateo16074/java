import java.util.Scanner;

public class PruebaLibroCalificaciones {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        LibroCalificaciones libroCalificaciones = new LibroCalificaciones(entrada.nextLine());

        libroCalificaciones.mostrarMensaje();
    }


}

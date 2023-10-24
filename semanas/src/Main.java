// una sola línea de códig
/* mas de dos líneas (multilínea) */
//Programa para imprimir un texto
public class Ejercicio
{
    //el método main empieza la ejecución de la aplicación en Java
    public static void main(String args[])
    {
        System.out.println("Primer Programa");
    } // fin del método main
} // fin de la clase Ejercicio

// Programa para imprimir un texto
public class Ejercicio
{
    //el método main empieza la ejecución de la aplicación en Java
    public static void main(String args[])
    {
        System.out.println("Este \nes \nsu primer \nprograma");
    } // fin del método main
} // fin de la clase Ejercicio
/*Inicialización de objetos mediante
constructores*/
public class PruebaLibroCalificaciones3 {
    public static void main(String args[]){
        LibroCalificaciones3 miLibro=new LibroCalificaciones3("JA00 Introducción a Java");
        LibroCalificaciones3 miLibro1=new LibroCalificaciones3("CSO Estructura de Datos");
        System.out.println("El nombre del curso es:"+miLibro.obtenerNombreDelCurso());
        System.out.println("El nombre del curso es:"+miLibro1.obtenerNombreDelCurso());
    }
}
/*Inicialización de objetos mediante
constructores*/
public class LibroCalificaciones3 {
    private String nombreDelCurso;
    public LibroCalificaciones3(String nombre){
        nombreDelCurso=nombre;
    }
    public void establecerNombreDelCurso(String nombre){
        nombreDelCurso=nombre;
    }
    public String obtenerNombreDelCurso(){
        return nombreDelCurso;
    }
    public void mostrarMensaje(){
        System.out.println("Bienvenido al libro de calificaciones para \n" +obtenerNombreDelCurso());
    }
}

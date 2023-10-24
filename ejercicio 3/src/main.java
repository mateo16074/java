import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Empleado empleado = new Empleado();

        System.out.println("Ingrese la cedula:");
        empleado.setCedula(in.nextLine());
        System.out.println("Ingrese la nombre:");
        empleado.setNombre(in.nextLine());
        System.out.println("Ingrese el apellido:");
        empleado.setApellido(in.nextLine());
        System.out.println("Ingrese el salario:");
        empleado.setSalario(in.nextLine());
        System.out.println("Ingrese el genero:");
        empleado.setGenero(in.nextLine().charAt(0));





    }
}

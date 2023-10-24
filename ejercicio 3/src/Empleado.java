import java.util.Calendar;
import java.util.GregorianCalendar;

public class Empleado {

    private String cedula;
    private String nombre;
    private String apellido;
    private double salario;
    private char genero;
    private Fecha fechaNacimiento;
    private Fecha fechaIngreso;

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Fecha getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Fecha fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int calcularEdad(){

       return restarFechas(fechaNacimiento);
    }
    public int calcularAntiguedad(){
        return restarFechas(fechaIngreso);
    }

    public double calcularPrestaciones(){
        double prestaciones = (salario * calcularAntiguedad()) / 12;
        return prestaciones;
    }

    private int restarFechas(Fecha fecha){
        GregorianCalendar gc = new GregorianCalendar();
        int dia = gc.get(Calendar.DAY_OF_MONTH);
        int mes = gc.get(Calendar.MONTH)+1;
        int year = gc.get(Calendar.YEAR);

        int diferencia = fecha.getYear()-year;


        if(mes == fecha.getMes()){
            if(dia < fecha.getDia()){
                diferencia = diferencia -1;
            }
        }
        if (mes < fecha.getMes()){
            diferencia = diferencia-1;
        }

        return diferencia;
    }
}

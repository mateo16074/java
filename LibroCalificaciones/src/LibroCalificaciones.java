public class LibroCalificaciones {

    private String nombreCurso;

    public LibroCalificaciones(String nombreCurso){
        this.nombreCurso=nombreCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public void mostrarMensaje(){

        System.out.println("Nombre del curso: " + nombreCurso);
    }
}

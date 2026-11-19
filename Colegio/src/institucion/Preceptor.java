package institucion;

public class Preceptor extends Persona {

    private String curso;

    public Preceptor(String nombre, int edad, String curso) {
        super(nombre, edad);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String cursoAsignado) {
        this.curso = cursoAsignado;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Curso asignado: " + curso);
    }
}

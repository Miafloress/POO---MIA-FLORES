package Almacenador;

public class AudioLibro extends MaterialDigital {

    public AudioLibro(String titulo) {
		super(titulo);
		// TODO Auto-generated constructor stub
	}

    @Override
    public void mostrarDescripcion() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Se puede escuchar");
    }
}

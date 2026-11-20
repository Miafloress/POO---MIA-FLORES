package Almacenador;

public class Main {

    public static void main(String[] args) {

        LibroDigital libro = new LibroDigital("Brigerton");

        AudioLibro audio = new AudioLibro("Los Juegos Del Hambre");

        libro.mostrarDescripcion();
        audio.mostrarDescripcion();
    }
}

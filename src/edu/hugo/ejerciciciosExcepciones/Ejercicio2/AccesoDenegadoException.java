package edu.hugo.ejerciciciosExcepciones.Ejercicio2;

public class AccesoDenegadoException extends RuntimeException {

    public AccesoDenegadoException() {
        super("Acceso denegado: No tienes los permisos necesarios.");
    }

    public AccesoDenegadoException(String mensaje) {
        super(mensaje);
    }

}
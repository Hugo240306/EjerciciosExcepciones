package edu.hugo.ejerciciciosExcepciones.Ejercicio3;

import java.util.HashMap;

/* Objetivo Didáctico: Uso de HashMap, creación de una Excepción Checked (Exception) y propagación
   obligatoria con throws. Enunciado: Somos los ingenieros de una nave espacial. Tenemos un ordenador
   de navegación que mapea nombres de planetas con sus coordenadas espaciales usando un HashMap<String,
    String>. Crea una excepción propia llamada PlanetaDesconocidoException que herede de Exception (Checked).
   Crea un método obtenerCoordenadas(String planeta). Este método debe propagar la excepción usando throws.
   Si el mapa no contiene la clave solicitada, lanza la excepción.
   En el main, llama a este método. Como es una Checked Exception, el compilador nos obligará a envolver
   la llamada en un try-catch. */

public class NavegadorEstelar {

    static HashMap<String, String> mapaPlanetas = new HashMap<>();

    public static String obtenerCoordenadas(String planeta)
            throws PlanetaDesconocidoException {

        if (!mapaPlanetas.containsKey(planeta)) {
            throw new PlanetaDesconocidoException(
                    "El planeta " + planeta + " no existe en la base"
            );
        }

        return mapaPlanetas.get(planeta);
    }

    public static void main(String[] args) {

        mapaPlanetas.put("Tierra", "X:120 Y:450 Z:78");
        mapaPlanetas.put("Marte", "X:890 Y:210 Z:500");
        mapaPlanetas.put("Jupiter", "X:340 Y:999 Z:100");

        try {

            System.out.println(obtenerCoordenadas("Marte"));
            System.out.println(obtenerCoordenadas("Pluton"));

        } catch (PlanetaDesconocidoException e) {

            System.err.println("error: " + e.getMessage());
        }
    }
}





package edu.hugo.ejerciciciosExcepciones.Ejercicio5;

import java.util.ArrayList;
import java.util.HashMap;

/*
Objetivo Didáctico: Integración total. Mapas que contienen Listas (HashMap<String, ArrayList<String>>),
propagación en cadena y excepciones personalizadas.
Enunciado: Vamos a construir el tablón de misiones del Gremio. Cada héroe tiene asignada una lista de
 misiones.
-Crea un HashMap<String, ArrayList<String>> donde la clave es el nombre del héroe y el valor es su lista
 de misiones.
-Crea una excepción HeroeNoRegistradoException (Checked).
-Crea un método verMisiones(String heroe) que propague la excepción hacia arriba (throws). Si el héroe no
está en el mapa, lanza la excepción.
-En el main, crea un bucle infinito que pida nombres de héroes por consola. Si el usuario escribe "salir",
el bucle termina. Si escribe un nombre, llama a verMisiones capturando la excepción con elegancia.
 */
public class ejercicio5 {

    static HashMap<String,String> tablonMisiones = new HashMap();

    public static void main(String[] args) {

        ArrayList<String> misiones1 = new ArrayList<>();
        misiones1.add("Matar al dragón");
        misiones1.add("Salvar la princesa");
        misiones1.add("Explorar la cueva");

        ArrayList<String> misiones2 = new ArrayList<>();
        misiones2.add("Defender el castillo");
        misiones2.add("Buscar el tesoro");

        ArrayList<String> misiones3 = new ArrayList<>();
        misiones3.add("Entrenar nuevos guerreros");
        misiones3.add("Derrotar a los bandidos");
        
        tablonMisiones.put("Batman", String.valueOf(misiones1));
        tablonMisiones.put("Superman", String.valueOf(misiones2));
        tablonMisiones.put("Flash", String.valueOf(misiones3));

    }
}

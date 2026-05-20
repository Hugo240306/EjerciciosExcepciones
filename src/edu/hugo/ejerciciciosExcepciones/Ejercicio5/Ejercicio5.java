package edu.hugo.ejerciciciosExcepciones.Ejercicio5;
import java.util.Scanner;

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

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TablonGremio.iniciarTablon();

        while(true){
            System.out.println("Introduce nombre de héroe para buscar o escribe salir para terminar");
            String entrada = sc.nextLine();
            if(entrada.equalsIgnoreCase("salir")){
                break;
            }
            try{
                System.out.println(TablonGremio.verMisiones(entrada));
            } catch (HeroeNoRegistradoException e) {
                System.err.println(e.getMessage());
            }

        }
    }
}

package edu.hugo.ejerciciciosExcepciones.Ejercicio5;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TablonGremio {

    private static HashMap<String, ArrayList<String>> misiones = new HashMap<>();
    private static int contador = 0;

    public static void iniciarTablon(){
        ArrayList<String> misionesConan = new ArrayList<>();
        misionesConan.add("Aventura en el desierto");
        misionesConan.add("Aventura en el mar");
        //insertamos como VALUE del HASHMAP para la KEY Conan la lista instanciada previamente
        TablonGremio.getMisiones().put("Conan", misionesConan);
        //insertamos como VALUE del HASHMAP para la KEY Batman una lista instanciada pero vacía
        TablonGremio.getMisiones().put("Batman", new ArrayList<>());
        //insertamos como VALUE del HASHMAP para la KEY Robin y sin una lista instanciada
        TablonGremio.getMisiones().put("Robin", null);
        //insertamos como VALUE del HASHMAP para la KEY Superman la lista instanciada y con valores
        TablonGremio.getMisiones().put("Superman", new ArrayList<>(Arrays.asList("Aventura en el cielo", "Aventura en Krypton")));
    }

    public static HashMap<String, ArrayList<String>> getMisiones() {
        return misiones;
    }

    public static void setMisiones(HashMap<String, ArrayList<String>> misiones) {
        TablonGremio.misiones = misiones;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        TablonGremio.contador = contador;
    }

    public static ArrayList<String> verMisiones(String heroe) throws HeroeNoRegistradoException{
        if(misiones.containsKey(heroe)){
            return misiones.get(heroe);
        }
        contador++;
        throw new HeroeNoRegistradoException("No se encuentra el héroe insertado por teclado como key en el mapa", contador);
    }
}


package edu.hugo.ejerciciciosExcepciones.Ejercicio4;

import java.util.ArrayList;
import java.util.HashMap;

/*
 Objetivo Didáctico: Combinar colecciones, procesamiento de datos y la sintaxis de captura múltiple
 unificada (operador |).
Enunciado: Estamos diseñando el carrito de la compra. Recibimos una lista (ArrayList) con códigos de
descuento en formato texto. Tenemos un catálogo (HashMap) con los valores de esos descuentos. Debemos
calcular el descuento total. Pero los datos están sucios: algunos códigos son nulos, otros no existen en el
 catálogo y otros no son números válidos.
 Itera la lista de códigos.
 Usa un bloque try-catch con la sintaxis de catch múltiple unificado
 (catch (NullPointerException | NumberFormatException e)) para ignorar los códigos corruptos y seguir
  sumando los correctos sin que el programa se cuelgue.
  */
public class Ejercicio4 {

    static ArrayList<String> codigosDescuento = new ArrayList<>();
    static HashMap<String, Integer> valorDescuentos = new HashMap<>();

    public static void main(String[] args) {

        valorDescuentos.put("descuento1", 10);
        valorDescuentos.put("descuento2", 20);
        valorDescuentos.put("descuento3", 5);

        codigosDescuento.add("descuento1");
        codigosDescuento.add("descuento2");
        codigosDescuento.add(null);
        codigosDescuento.add("descuento80");
        codigosDescuento.add("descuento3");

        int totalDescuento = 0;

        for (String codigo : codigosDescuento) {

            try {

                if (codigo.equals("")) {
                    continue;
                }

                Integer valor = valorDescuentos.get(codigo);

                if (valor == null) {
                    throw new NumberFormatException(
                            "Código no válido: " + codigo
                    );
                }

                totalDescuento += valor;

            } catch (NullPointerException | NumberFormatException e) {

                System.err.println("Código ignorado -> " + e.getMessage());
            }
        }

        System.out.println("Descuento total: " + totalDescuento);
    }
}
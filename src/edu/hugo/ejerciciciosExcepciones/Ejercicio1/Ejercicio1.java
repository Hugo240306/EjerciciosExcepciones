package edu.hugo.ejerciciciosExcepciones.Ejercicio1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {

    private static ArrayList<String> inventario = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        inventario.add("Bate");
        inventario.add("Botiquín");
        inventario.add("Escopeta");
        int indice;
        try {
            System.out.println("Introduce el índice del objeto que quieres equipar: ");
            indice = sc.nextInt();
            System.out.println("Has equipo el elemento del índice: " + indice);
            System.out.println("El objeto es: " + inventario.get(indice));
        }catch (IndexOutOfBoundsException index){
            System.err.println("Búsqueda fuera del tamaño del array");
            System.err.println(index.getMessage());
        }catch (InputMismatchException input){
            System.err.println("Input inválido, tienes que meter un número entero no superior al tamaño del array");
        }finally{
            sc.close();
        }




    }
}
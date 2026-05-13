package edu.hugo.ejerciciciosExcepciones.Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Firewall.anadirIp( "192.168.1.1");
        Firewall.anadirIp( "192.168.1.2");

        System.out.println("Introduce tu IP: ");
        String ip = sc.nextLine();
        try {
            if (!Firewall.conectar(ip)) {
                throw new AccesoDenegadoException();
            } else {
                System.out.println("Conectado a: " + ip);
            }
        }catch (AccesoDenegadoException ade){
            System.err.println(ade.getMessage());
        }
    }
}
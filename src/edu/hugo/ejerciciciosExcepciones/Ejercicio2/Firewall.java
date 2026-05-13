package edu.hugo.ejerciciciosExcepciones.Ejercicio2;

import java.util.HashSet;

public class Firewall {

    private static HashSet<String> allowedIps = new HashSet<>();

    public static HashSet<String> getAllowedIps() {
        return allowedIps;
    }

    public static void setAllowedIps(HashSet<String> allowedIps) {
        Firewall.allowedIps = allowedIps;
    }

    public static void anadirIp(String ip){
        allowedIps.add(ip);
    }

    public static boolean conectar(String ip){
        if(allowedIps.contains(ip)){
            return true;
        }
        return false;
    }
}
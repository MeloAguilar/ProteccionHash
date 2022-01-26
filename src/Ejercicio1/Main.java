package Ejercicio1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(obtenerHash(pedirRuta(sc)));
    }
    /**
     * Hacer un programa que tu le des la ruta de un fichero y te devuelva el codigo hash con el algoritmo SHA-256

     */

private static String pedirRuta(Scanner sc){
    System.out.println("Escribe la ruta del archivo");
    return sc.nextLine();
}


private static byte[] obtenerHash(String ruta){
    int hash;

    hash = ruta.hashCode();

    return hash;
}
}
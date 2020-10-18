package control;

import modelo.NumerosAleatorios;

/**
 *
 * @author Jesus, Christian, Marcos, Osmar
 */
public class Hilos {
    public static int[] generados = new int[15];
    public static int indice = 0;
    
    public static void main(String[] args) {
        NumerosAleatorios hilo1 = new NumerosAleatorios("A", 5, 77, 500);
        NumerosAleatorios hilo2 = new NumerosAleatorios("B", 5, 88, 700);
        NumerosAleatorios hilo3 = new NumerosAleatorios("C", 5, 99, 1200);
        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}
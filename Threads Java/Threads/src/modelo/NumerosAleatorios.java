package modelo;

import control.Hilos;

/**
 *
 * @author Jesus, Christian, Marcos, Osmar
 */
public class NumerosAleatorios extends Thread {
    private final String name;
    private final int cont;
    private final int max;
    private final long delay;

    public NumerosAleatorios(String name, int cont, int max, long delay) {
        this.name = name;
        this.cont = cont;
        this.max = max;
        this.delay = delay;
    }
    
    @Override
    public void run(){
        System.out.println("Inicio de hilo " + name);
        try {
            for(int i = 0; i < cont; i++){
                Thread.sleep(delay);
                int numero = (int) (Math.random() * max + 1);
                if(verificarNoRepetido(numero)){
                    System.out.println("Hilo " + name + ": " + numero);
                    Hilos.generados[Hilos.indice++] = numero;
                }else{
                    i--;
                }
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Fin de hilo " + name);
    }
    
    private boolean verificarNoRepetido(int num){
        int cant = 0;
        for(int j : Hilos.generados){
            if(num == j)
                cant++;
        }
        return cant == 0;
    }
}
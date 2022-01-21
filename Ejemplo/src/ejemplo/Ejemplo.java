/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

import org.apache.commons.lang3.RandomUtils;

/**
 *
 * @author reroes
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 100;
        int b = 110;

        obtenerValor(a, b);

    }

    public static void obtenerValor(int a, int b) {
        int[] arreglo = new int[10];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = RandomUtils.nextInt(a, b);
            System.out.printf("%d\n", arreglo[i]);
        }

        
    }
}

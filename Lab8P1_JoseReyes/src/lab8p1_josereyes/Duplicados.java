/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p1_josereyes;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author josem
 */
public class Duplicados {
    private int[] numeros;

    public Duplicados(int size) {
        numeros = new int[size];
    }

    public void llenarArreglo() {
        Random random = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(10) + 1;
        }
    }

    public void GeteliminarDuplicados() {
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    numeros[j] = 0;
                }
            }
        }
    }
    public void imprimirArreglo() {
        System.out.print("[ ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println("]");
    }
}

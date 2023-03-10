/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p1_josereyes;

/**
 *
 * @author josem
 */
public class Omatrix{
   private char[][] matriz;

    public Omatrix(String oracion) {
        String[] palabras = oracion.split(" ");
        int filas = palabras.length;
        int columnas = 0;
        for (String palabra : palabras) {
            if (palabra.length() > columnas) {
                columnas = palabra.length();
            }
        }
        matriz = new char[filas][columnas];
        for (int i = 0; i < filas; i++) {
            String palabra = palabras[i];
            for (int j = 0; j < palabra.length(); j++) {
                matriz[i][j] = palabra.charAt(j);
            }
            for (int j = palabra.length(); j < columnas; j++) {
                matriz[i][j] = '-';
            }
        }
    }

    public void OMatrix() {
        for (char[] fila : matriz) {
            for (char c : fila) {
                if (c != '-') {
                    System.out.print("[" + c + "]");
                }
            }
            System.out.println();
        }
    }

    public char[][] getMatriz() {
        return matriz;
    }
}

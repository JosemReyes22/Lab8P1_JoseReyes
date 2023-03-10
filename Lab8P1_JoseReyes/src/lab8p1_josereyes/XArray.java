/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p1_josereyes;

/**
 *
 * @author josem
 */
public class XArray {
    private int[][] matriz;
    private int[] diagonales;

    public XArray(int[][] matriz) {
        this.matriz = matriz;
        diagonales = new int[matriz.length * 2 - 1];
    }

    public void sacarDiagonales() {
        int pos = 0;
        for (int i = 0; i < matriz.length; i++) {
            diagonales[pos++] = matriz[i][i];
            if (i != matriz.length - 1) {
                diagonales[pos++] = matriz[i][matriz.length - 1 - i];
            }
        }
    }

    public int[] getDiagonales() {
        return diagonales;
    }
}




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab8p1_josereyes;

/**
 *
 * @author josem
 */
import java.util.Scanner;
import java.util.Random;
public class Lab8P1_JoseReyes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner r=new Scanner(System.in);
        Random ran=new Random();
        
        int menu=1;
        while(menu==1){
            System.out.println("~~~Menu Principal~~~");
            System.out.println("1.X-Array\n2.Sin duplicados\n3.Oracion de matriz\n4.Salir");
            int opcion=r.nextInt();
            
            switch(opcion){
                case 1:{
                    System.out.print("Ingrese un tamaño: ");
                    int n = r.nextInt();

                    int[][] matriz = new int[n][n];
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            matriz[i][j] = (int) (Math.random() * 3000) + 1100;
                        }
                    }

                    System.out.println("Matriz generada:");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            System.out.print("[" + matriz[i][j] + "]");
                        }
                        System.out.println();
                    }

                    XArray xArray = new XArray(matriz);
                    xArray.sacarDiagonales();

                    int[] diagonales = xArray.getDiagonales();
                    System.out.print("Arreglo de diagonales: ");
                    for (int i = 0; i < diagonales.length; i++) {
                       System.out.print("[" + diagonales[i] + "]");
                    }
                    System.out.println();
                    //me imprime los numeros de las diagonales pero no en el orden que se
                }break;
                case 2:{
                    System.out.print("Ingrese un tamaño entre 5 y 10: ");
                int tam = r.nextInt();
                while (tam < 5 || tam > 10) {
                    System.out.print("Tamaño inválido, ingrese un tamaño entre 5 y 10: ");
                    tam = r.nextInt();
                }
                Duplicados duplicados = new Duplicados(tam);
                duplicados.llenarArreglo();
                System.out.print("Arreglo original: ");
                duplicados.imprimirArreglo();

                duplicados.GeteliminarDuplicados();
                System.out.print("Arreglo sin duplicados: ");
                duplicados.imprimirArreglo();
                }break;
                case 3:{
                    System.out.print("Ingrese una oracion: ");
                     r.nextLine();
                    String oracion = r.nextLine();
                    Omatrix om = new Omatrix(oracion);
                    char[][] matriz = om.getMatriz();
                    System.out.println("Matriz resultante:");
                    for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < matriz[i].length; j++) {
                            if (matriz[i][j] != '-') {
                                System.out.print("[" + matriz[i][j] + "]");
                            }
                        }
                        System.out.println();
                    }
                }break;
                case 4:{
                    menu=0;
                    System.out.println("---Programa finzalizado---");
                }break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }  
}

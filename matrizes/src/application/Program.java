package application;

/* Checklist:
 * Revisão do conceito de matriz
 * Declaração e instanciação
 * Acesso aos elementos / como percorrer uma matriz
 * Propriedade length
 */

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        //pra criar uma matriz em java, vou declarar qual o tipo de matriz, nesse caso de Integer
        //esses dois [][] servem para indicar que é bidimensional
        int[][] mat = new int[n][n];

        //sendo x para as linhas (eixo X) e y para as colunas (eixo Y)
        for (int x = 0; x < mat.length; x++){
            for (int y = 0; y < mat.length/*mat[y].length*/; y++){
                mat[x][y] = sc.nextInt();
            }
        }

        System.out.println("Main diagonal");
        for (int i = 0; i < mat.length; i++){
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();

        int countNegatives = 0;

        for (int x = 0; x < mat.length; x++){
            for (int y = 0; y < mat.length/*mat[y].length*/; y++){
                if (mat[x][y] < 0){
                    countNegatives++;
                }
            }
        }

        System.out.println("Negative numbers = " + countNegatives);

        sc.close();
    }
}


package pinturarecursivo;

import java.util.Random;

/**
 *
 * @author sebas
 */
public class matriz {
    
    public static int[][]nuevaMatriz(int f, int c){
        int[][] matriz = new int[f][c];
        Random dice = new Random();
        
        for (int i = 0; i < f; i++){
            for (int j = 0; j < c; j++){
                matriz[i][j] = dice.nextInt(6) + 1;
            }
        }
        
        return matriz;
    }
    
    public static void escribirMatriz(int f, int c, int[][] matriz){
        
        for (int a = 0; a < f; a++){
            System.out.print("|");
            for (int b = 0; b < c; b++){
                System.out.print(matriz[a][b] + "|");
            }
            System.out.println("");
        }
        
    }
    
    public static int posicionAleatoria(int nm){
        Random dice = new Random();
        
        int xy = dice.nextInt(nm);
        
        return xy;
    }
    
}

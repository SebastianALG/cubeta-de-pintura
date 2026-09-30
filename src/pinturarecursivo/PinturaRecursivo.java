
package pinturarecursivo;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class PinturaRecursivo {

    public static void main(String[] args) {
        
        // entrada
        Scanner read = new Scanner(System.in);
        int n, m, fila, columna, color, colorOriginal;
        
        System.out.print("escribe el numero de filas: ");
        n = read.nextInt();
        System.out.print("escribe el numero de columnas: ");
        m = read.nextInt();
        
        int[][] A = matriz.nuevaMatriz(n, m);
        
        matriz.escribirMatriz(n, m, A);
        
        
        fila = matriz.posicionAleatoria(n);
        columna = matriz.posicionAleatoria(m);
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("la posicion aleatoria es: (" + fila +"," + columna +")");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        

        colorOriginal = A[fila][columna];
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("el color original es: "+ colorOriginal);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        
        System.out.print("escribe un numero del 1 al 6 para elegir el color de tu cubeta: ");
        color = read.nextInt();
        
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        if (colorOriginal == color){
            System.out.println("Este color ya esta en esa posicion, no hay nada que cambiar.");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        }
        
        //toma de tiempo
        long inicio = System.nanoTime();
        
        // procesos
        cubeta.pintar(colorOriginal, color, n, m, fila, columna, A);
        
        //toma de tiempo salida
        long fin = System.nanoTime();
        
        //salida
        matriz.escribirMatriz(n, m, A);
        
        long tiempo = fin - inicio;
        
        System.out.println("el tiempo de ejecucion del algoritmo es: "+ tiempo + "nanoSegundos");
    
    }
    
}

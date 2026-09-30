
package pinturarecursivo;

/**
 *
 * @author sebas
 */
public class cubeta {
    
    public static void pintar(int colorOriginal, int colorNuevo, int tamañof, int tamañoc, int f, int c, int[][] matriz){
        
        if (f >= 0 && f < tamañof && c >= 0 && c < tamañoc && matriz[f][c] == colorOriginal){
           matriz[f][c] = colorNuevo;
           
           cubeta.pintar(colorOriginal, colorNuevo, tamañof, tamañoc, f + 1, c, matriz);
           cubeta.pintar(colorOriginal, colorNuevo, tamañof, tamañoc, f, c + 1, matriz);
           cubeta.pintar(colorOriginal, colorNuevo, tamañof, tamañoc, f - 1, c, matriz);
           cubeta.pintar(colorOriginal, colorNuevo, tamañof, tamañoc, f, c - 1, matriz);
        }
        
    }
}

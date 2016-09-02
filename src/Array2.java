/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos
 */
public class Array2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=4;
        int x=1;
        int i,j;
        int dim=n+1;
      int[][] mat = new int[dim][dim];
        for (int a = 1; a <= n / 2; a++) {
            for (i = a; i <= n - a; i++) {
                mat[a][i] = x;
                x++;
            }
            for (i = a; i <= n - a; i++) {
                mat[i][n - a + 1] = x;
                x++;
            }
            for (i = n - a + 1; i >= a + 1; i--) {
                mat[n - a + 1][i] = x;
                x++;
            }
            for (i = n - a + 1; i >= a + 1; i--) {
                mat[i][a] = x;
                x++;
            }
        }
        if (n % 2 == 1) {
            mat[n / 2 + 1][n / 2 + 1] = x;
        }
       
        ///////////////////////////////////////////////////////////////
        
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                System.out.print("\t" + mat[i][j]);
            }
            System.out.println();
        }
        
        
    }
    
}

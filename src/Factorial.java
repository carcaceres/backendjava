
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        int fact=1;
        int n=0;
        int i=0;
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(input);
     
        System.out.println("Digite el Numero");
        n=Integer.valueOf(teclado.readLine());
        
        
        if(n==0 || n==1){
            System.out.println("Factorial de "+n+" es "+fact);
        }
        else{
            for(i=2;i<=n;i++){
                fact=fact*i;
            }
                   System.out.println("Factorial de "+n+" es "+fact);
    
        
        }
        
        
        
    }
    
}

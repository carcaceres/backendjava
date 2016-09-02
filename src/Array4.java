
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
public class Array4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        // solo acepta el elementos numero pares
        int a[]=new int[5];
        int i=0;
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(input);
        int n=0;
        
    
        for(i=0;i<5;i++){
             if(i%2==0){
          
            System.out.println("digite un numero a["+i+"]");
            n=Integer.valueOf(teclado.readLine());
             a[i]=n;
            }
            else{
                a[i]=0;
                
            }
         
        }
        
        
         for(i=0;i<5;i++){
            System.out.print(a[i]+"-");
        }
        
    }
    
}

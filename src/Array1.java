/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos
 */
public class Array1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[][] = new int[3][3];
        int i,j;
        
        for(i=0;i<a.length;i++){
            for(j=0;j<a.length;j++){
                if(j==0){
                    a[i][j]=2;
                }
                else if(i==2){
                    a[i][j]=2;
                }
                else{
                    a[i][j]=1;
                }
                
            }
        }
        
          for(i=0;i<a.length;i++){
            for(j=0;j<a.length;j++){
             
                if(j==2){
                    System.out.println(a[i][j]);
                
                }
                else{
                    System.out.print(a[i][j]);
                }
                
                
            }
        }
        
        
        System.out.println("");
        
        
    }
    
}


import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos
 */
public class Aleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dado1 = (int) (Math.random()*6+1);
        int dado2 = (int) (Math.random()*6+1);
        System.out.println(dado1);
        System.out.println(dado2);
        if(dado1==6 && dado2==6){
            System.out.println("chuza");
        }
        
        System.out.println(Math.addExact(2, 3));
    }
    
}

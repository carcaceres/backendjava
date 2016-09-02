
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
public class Primos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        int a = 0, i, n;
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(input);

        System.out.println("Ingrese numero");
        n = Integer.valueOf(teclado.readLine());
        for (i = 1; i < (n + 1); i++) {
            if (n % i == 0) {
                a++;
            }
        }
        if (a != 2) {
            System.out.println("No es Primo");
        } else {
            System.out.println("Si es Primo");
        }
    }

}

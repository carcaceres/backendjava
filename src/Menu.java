
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
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(input);
        double calc, n1, n2;
        int op;
        int flag = 0;
        do {
            do {
                System.out.print("Digite Numero 1 ");
                n1 = Integer.valueOf(teclado.readLine());
                System.out.print("Digite Numero 2 ");
                n2 = Integer.valueOf(teclado.readLine());
                System.out.println("");
                System.out.println("");
             
                System.out.println("**** Operacion *****");
                System.out.println("1. Suma");
                System.out.println("2. Resta");
                System.out.println("3. Multiplicación");
                System.out.println("4. División");
                System.out.println("5. Salir");

                System.out.print("Digite la Opción ");
                op = Integer.valueOf(teclado.readLine());
                if (op <= 0) {
                    System.out.println("Opción Invalida!!");
                    flag = 0;
                } else {
                    flag = 1;
                }
            } while (flag == 0);

            switch (op) {
                case 1:
                    calc = n1 + n2;
                    System.out.println("Suma "+calc);
                break;  
                case 2:
                    calc = n1 - n2;
                    System.out.println("Resta "+calc);
             
                break;  
                case 3:
                    calc = n1 * n2;
                    System.out.println("Multiplicación "+calc);
                break;  
                case 4:
                    if(n2==0){
                        System.out.println("Error n2 es Cero!!");
                    }
                    else{
                    calc = n1 / n2;
                     System.out.println("División "+calc);
              
                    }
                break;  
                 case 5:
                     System.out.println("CHaooo");
                break;  
                default:
                    System.out.println("Opcion Invalida");

            }

        } while (op >= 1 && op <= 4);

    }

}

package ProjetodePeso;

import java.util.Scanner;

/**
 *
 * @author Daniela
 */
public class ProjetodePeso {
    public static void main(String[] args) {
        double pesoPrato, valor;
      Scanner ler = new Scanner (System.in);
       System.out.println("Informe o peso do prato:");
       pesoPrato = ler.nextDouble();
       
       valor = pesoPrato * 12;
       
       System.out.println("Total a pagar:"+valor);
    }
    
}

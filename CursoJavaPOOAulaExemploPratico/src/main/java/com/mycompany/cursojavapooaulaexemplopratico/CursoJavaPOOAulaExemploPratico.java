package com.mycompany.cursojavapooaulaexemplopratico;
import java.util.Scanner;

public class CursoJavaPOOAulaExemploPratico {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ContaBanco cliente = new ContaBanco(0, "cc", "null", 0.00, false);
        
        cliente.status();
        
        System.out.println();
        
        cliente.abrirConta();
        
        cliente.setNumConta(2); cliente.setDono("Lucas");
        
        System.out.println();

        double saque = scan.nextDouble();
        cliente.sacar(saque);
        
        cliente.status();
  
        
        
        
    }
}

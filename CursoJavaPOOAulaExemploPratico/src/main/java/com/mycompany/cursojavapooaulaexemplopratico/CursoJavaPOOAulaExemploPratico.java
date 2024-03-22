package com.mycompany.cursojavapooaulaexemplopratico;

public class CursoJavaPOOAulaExemploPratico {

    public static void main(String[] args) {
        
        ContaBanco cliente = new ContaBanco(0, "cc", "null", 0.00, false);
        
        cliente.status();
        
        System.out.println();
        
        cliente.abrirConta();
        
        cliente.setNumConta(2); cliente.setDono("Lucas");
        
        System.out.println();
        
        cliente.sacar(20.0);
        
        cliente.status();
  
        
        
        
    }
}

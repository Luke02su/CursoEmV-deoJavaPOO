package com.mycompany.cursopoojavaaula04;

public class CursoPOOJavaAula04 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("Branca", 3f, "Preta", false);
        
        System.out.println(c1.getModelo() + ", " + c1.getPonta() + ", " + c1.getCor() + ", " + c1.isTampada());
        
        c1.setModelo("Tilibra");
        c1.setPonta(2.5f);
        c1.setCor("Azul");
        c1.setTampada(false);
        
        System.out.println(c1.getModelo() + ", " + c1.getPonta() + ", " + c1.getCor() + ", " + c1.isTampada());
                

        
//        Caneta c1 = new Caneta("Anatel", 0.5f, "Azul", false); // passando parâmetros
//        c1.status();
//        Caneta c2 = new Caneta("Bue", 1.0f, "Amarela", true);
//        c2.status();
       
       
        
        
       // c1.setModelo("BIC"); // metodo acessor
        //c1.modelo = "BIC"; // acessa diretamente (se estiver privado em caneta não acessa diretamente.)

        //c1.setPonta(2.5f);
        // c1.ponta = 2.4f; // privado, não funciona

       // System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());

       // método get e set protegem o acesso aos atributos
       
    }
}

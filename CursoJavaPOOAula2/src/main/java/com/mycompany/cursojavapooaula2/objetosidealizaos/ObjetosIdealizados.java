package com.mycompany.cursojavapooaula2.objetosidealizaos;

public class ObjetosIdealizados {

    public static void main(String[] args) {
        Porta p1 = new Porta();
        
        p1.material = "Vidro";
        p1.altura = 1.98;
        p1.largura = 1.20;
        
        p1.fechar();
        p1.status();
        p1.baterNaPorta();
       
        System.out.println();
        
        Sono s1 = new Sono(); 
        
        s1.duracao = "8h";
        s1.qualidade = "Bom";
        
        s1.dormir();
        s1.status();
        s1.estudar();
    }
}

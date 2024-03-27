package com.mycompany.atividade3_2_correcao_estudar;

public class Atividade3_2_Correcao_Estudar{

    public static void main(String[] args) {
        Empregado e1 = new Empregado("Denis", "Lima", 2000);
        
        Empregado e2 = new Empregado("Maria", "Lima", 5000);
        
        //System.out.println(e1); // string to string
        //System.out.println(e1.toString()); // string to string
     
        System.out.println("Nome: " + e1.getNome() + " " + e1.getSobrenome() + "\nSalário mensal: " + e1.getSalario());
        e1.aumentarSalarioPorcentagem(20);
        e1.aumentarSalario();
        System.out.println("Nome: " + e1.getNome() + " " + e1.getSobrenome() + "\nSalário mensal: " + e1.getSalario());
        e1.imprimirSalarioAnual();
        System.out.println();
        System.out.println(e1);
        
      
    }
}

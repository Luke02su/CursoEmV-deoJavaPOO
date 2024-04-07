package com.mycompany.cursojavapooaula13;

public class Cachorro extends Lobo { // herança de diferença

    @Override
    public void emitirSom() { // se não sobreescrever, mantém o método de lobo
        System.out.println("Au! au! au!");
    }
    
    public void reagir(String frase) { // polimorfismo de sobrecarga
        if(frase.equals("Toma comida") || frase.equals("Olá")) {
            System.out.println("Abanar e latir.");
        } else {
            System.out.println("Rosnar");
        }
    }
    
    public void reagir(int hora, int min) { // polimorfismo de sobrecarga
        if(hora < 12) {
            System.out.println("Abanar.");
        } else if (hora >= 18) {
            System.out.println("Ignorar.");
        } else {
            System.out.println("Abanar e latir.");
        }
    }
    
    public void reagir(boolean dono) { // polimorfismo de sobrecarga
        if(dono) {
            System.out.println("Abanar.");
        } else {
            System.out.println("Rosnar e latir.");
            this.emitirSom();
        }
    }
    
    public void reagir(int idade, float peso) { // polimorfismo de sobrecarga
        if(idade < 5) {
            if(peso < 10) {
                System.out.println("Abanar.");
            } else {
                System.out.println("Latir.");
            }
        } else {
            if (peso < 10){
                System.out.println("Rosnar");
            } else {
                System.out.println("Ignorar");
            }
        }
    }
    
    //public void reagir(float x, int y) { // diferente do de cima (independente do tipo de retorno, o que importa é a assinatura e ordem dela)
        
    //}
}

// assinatura = quantidade e tipos de atributos
// polimorfismo de sobreposição = mesma assinatura em classes diferentes
// polimorfismo de sobrecarga = assinaturas diferentes na mesma classe -  mesmo método (nome) com variação de assinatura na mesma classe
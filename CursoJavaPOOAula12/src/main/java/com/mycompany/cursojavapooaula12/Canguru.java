package com.mycompany.cursojavapooaula12;

public class Canguru extends Mamifero { // subcclasse - herança de diferença
    
    public void usarBolsa() {
        System.out.println("Usando bolsa.");
    }

    @Override
    public void locomover() {
        System.out.println("Saltando.");
    }
}

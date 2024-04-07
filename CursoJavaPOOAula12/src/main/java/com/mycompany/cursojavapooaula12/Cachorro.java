package com.mycompany.cursojavapooaula12;

public class Cachorro extends Mamifero { // subclasse - herança de diferença

    @Override
    public void emitirSom() {
        System.out.println("Latindo.");
    }
      
    public void enterrarOsoo() {
        System.out.println("Enterrando osso.");
    }
    
    public void abanarRabo() {
        System.out.println("Abanando rabo.");
    }
}

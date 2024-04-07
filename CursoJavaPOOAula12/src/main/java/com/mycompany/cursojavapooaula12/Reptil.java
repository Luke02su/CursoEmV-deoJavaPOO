package com.mycompany.cursojavapooaula12;

public class Reptil extends Animal{ // usubclasse - herança de diferença
    private String corEscama;
    
    @Override
    public void locomover() {
        System.out.println("Rastejando.");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de reptil.");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}

package com.mycompany.cursojavapooaula12;

public class Ave extends Animal { // subclasse herança de diferença
    private String corPena;

    @Override
    public void locomover() {
        System.out.println("Voando.");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave.");
    }
    
    public void construirNinho() {
        System.out.println("Construiu um ninho.");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    
}

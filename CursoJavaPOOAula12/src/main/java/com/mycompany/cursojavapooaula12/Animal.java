package com.mycompany.cursojavapooaula12;

public abstract class Animal { // superclasse
    //Atributos protegidos
    protected float peso;
    protected int idade;
    protected int membros;
    
    // Métodos abstrados
    public abstract void locomover(); // polimorfismo de sobreposição em todas as subclasses [Acontece quando substituímos umm método de uma superclasse na sua subclasse, usando a mesma assinatura.]
    public abstract void alimentar(); // polimorfismo de sobreposição em todas as subclasses
    public abstract void emitirSom(); // polimorfismo de sobreposição em todas as subclasses

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
}
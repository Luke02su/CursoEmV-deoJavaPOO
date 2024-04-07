package com.mycompany.cursojavapooaula13;

public abstract class Animal {
    protected float peso;
    protected int idade;
    protected int membros;
    
    public abstract void emitirSom(); // mesma assinatura deste método em subclasses diferentes (SOBREPOSIÇÂO SÓ UMA VEZ E EM CLASSES DISTINTAS)
}
    

// polimorfismo sobreposição (override) mais comum
// só posso ter método abstrato em classe abstrata
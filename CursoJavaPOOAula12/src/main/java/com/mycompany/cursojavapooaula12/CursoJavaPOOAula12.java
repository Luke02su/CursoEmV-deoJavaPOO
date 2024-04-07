package com.mycompany.cursojavapooaula12;

public class CursoJavaPOOAula12 {

    public static void main(String[] args) {
        
        //Animal am1 = new Animal(); não pode ser instanciado.
        Mamifero m1 = new Mamifero();
        Reptil r1 = new Reptil();
        Peixe p1 = new Peixe();
        Ave a1 = new Ave();
        Canguru c1 = new Canguru();
        Cachorro ca = new Cachorro();
        Cobra co1 = new Cobra();
        Tartaruga t1 = new Tartaruga();
        Arara ar = new Arara();
        Goldfish g1 = new Goldfish(); 
        
      
        m1.setIdade(1);
        m1.setMembros(4);
        m1.setPeso(6.67f);
        m1.setCorPelo("Azul");
        System.out.println(m1.getCorPelo());
                       
        m1.alimentar();
        m1.idade = 12;
        System.out.println(m1.idade);
        
        r1.alimentar();
        r1.locomover();
        r1.emitirSom();
        
        c1.locomover(); // sobreposicão de Mamífero (polimosfismo de sobreposição)
        ca.emitirSom(); // sobreposicão de Mamífero (polimorfismo de sobreposição)
        
        t1.locomover();
        
    }
}

// polimorfismo: muitas formas
// polimorfismo de sobreposição: sobrepõe método da superclasse na subclasse
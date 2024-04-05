package com.mycompany.cursojavapooaula11;

public class CursoJavaPOOAula11 {

    public static void main(String[] args) {
        
        //Pessoa p1 = new Pessoa(); // classe abstrata não pode ser instanciado em um objeto
        Visitante v1 = new Visitante(); // subclasse (filha) de Pessoa
       
        v1.setNome("Fernando");
        v1.setIdade(19);
        v1.setSexo('M');
        System.out.println(v1.toString());
        
        System.out.println();
        
        Aluno a1 = new Aluno(); // subclasse de Pessoa
        
        a1.setNome("José");
        a1.setMatricula(121);
        a1.setCurso("Informática");
        a1.setIdade(20);
        a1.setSexo('M');
        a1.pagarMensalidade();
        System.out.println(a1.toString());
        
        System.out.println("");
        
        Professor p1 = new Professor();
        
        p1.setNome("Adailton");
        p1.setEspecialidade("História");
        p1.setIdade(80);
        p1.setSexo('M');
        p1.setSalario(2000.0f);
        p1.receberAumento(1000.0f);
        System.out.println(p1.getSalario());
        System.out.println(p1.toString());
        
        System.out.println();
        
        Bolsista b1 = new Bolsista(); // subclasse de Aluno e Pessoa
        
        b1.setNome("Maria");
        b1.setBolsa(12.5f);
        b1.setSexo('F');
        System.out.println(b1.toString());
        b1.pagarMensalidade();
        
        System.out.println();
        
        Tecnico t1 = new Tecnico();
        
        t1.setNome("Ana");
        t1.setIdade(24);
        t1.setSexo('F');
        t1.setRegistroProfissional(23);
        t1.praticar();
        System.out.println(t1.toString());
    }
}

// herança de implementação (adiciona nada, herda apenas) = Visitante
// herança de diferença (adiciona métodos e atributos) = Aluno, Bolsista

// ---------

//Classe abstrata não pode ser instanciada, serve apenas como progenitora
//Método abstrato é declarado, mas não pode ser implementado na pogenitora 9classe abstrata ou interface)
// Classe final não tem filhos (folha) (bção pode usar herança)
// Método final não pode ser sobreescrito pelas suas subclasses. Obrigatoriamente herdado. (Não pode gerar especialização)

// abstrado usa (implementa) nos filhos
// final usa (implementa) apenas nos pais
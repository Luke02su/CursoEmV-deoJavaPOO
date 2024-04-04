package com.mycompany.cursojavapooaula11;

public class CursoJavaPOOAula11 {

    public static void main(String[] args) {
        
        //Pessoa p1 = new Pessoa(); // classe abstrata não pode ser instanciado em um objeto
        Visitante v1 = new Visitante(); // subclasse de Pessoa
        Aluno a1 = new Aluno(); // subclasse de Pessoa
        Bolsista b1 = new Bolsista(); // subclasse de Aluno e Pessoa
    }
}

// herança de implementação (adiciona nada, herda apenas) = Visitante
// herança de diferença (adiciona métodos e atributos) = Aluno, Bolsista

// ---------

//Classe abstrata não pode ser instanciada, serve apenas como progenitora
//Método abstrato é declarado, mas não pode ser implementado na pogenitora 9classe abstrata ou interface)
// Classe final não tem filhos (folha) (bção pode usar herança)
// Método final não pode ser sobreescrito pelas suas subclasses. Obrigatoriamente herdado. (Não pode gerar especialização)

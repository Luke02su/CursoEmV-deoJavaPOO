package com.mycompany.cursojavapooaula09;

public class CursoJavaPOOAula09 {

    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("Lucas", 19, "M");
        
        Livro l1 = new Livro("Conta Comigo", "Wilson Mello", 120, p1); // p1 objeto instanciado da classe 
        Livro l2 = new Livro("A Menina que não Tinha medo do Escuro", "Wilson Mello", 100, p1);
        
        l1.abrir();
        l1.folhear(100); // passa parâmetro da página aberta
        l1.avancarPag();
        l1.voltarPag();
        l1.detalhes();
        
        l2.abrir();
        l2.folhear(100); // passa parâmetro da página aberta
        l2.avancarPag();
        l2.voltarPag();
        l2.detalhes();
    }
}

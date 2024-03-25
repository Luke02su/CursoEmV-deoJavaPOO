package com.mycompany.cursojavapooaula05;

public class CursoJavaPOOAula05 {

    public static void main(String[] args) {
        
        ContaBanco cb1 = new ContaBanco();
        cb1.setNumConta(111);
        cb1.setDono("Jubileu");
        cb1.abrirConta("CC");
        
        ContaBanco cb2 = new ContaBanco();
        cb1.setNumConta(222);
        cb2.setDono("Creuza");
        cb2.abrirConta("CP");
        
        cb1.depositar(100);
        cb2.depositar(500);
        cb2.sacar(100);
        
        cb1.sacar(150);
        cb1.fecharConta();
        
        cb1.estadoAtual();
        cb2.estadoAtual();
    }
}

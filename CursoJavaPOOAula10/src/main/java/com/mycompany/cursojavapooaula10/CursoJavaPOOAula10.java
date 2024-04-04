package com.mycompany.cursojavapooaula10;

public class CursoJavaPOOAula10 {

    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Lucas");
        p2.setNome("Maria");
        p3.setNome("Cláudia");
        p4.setNome("Fabio");
        
        p2.setCurso("Informática");
        p3.setSalario(3000.0);
        p4.setSetor("Estoque");
        
        p1.setSexo('M');
        p2.setIdade(54);
        p3.setSexo('F');
        p4.setIdade(34);
        
//        p1.receberAumento(550.20); // método da subclasse não pode ser usado na superclasse, no objeto instanciado (objeto diferente)
//        p2.mudarTrabalho();
//        p4.cancelarMatr();
       
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
        System.out.println(p4.isTrabalhando());
        p4.mudarTrabalho();
        System.out.println(p4.isTrabalhando());
    }
}
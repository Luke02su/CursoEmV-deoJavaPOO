package com.mycompany.cursojavapooaula11;

public class Aluno extends Pessoa{ // herança para diferença
    private int matricula;
    private String curso;
    
    public void pagarMensalidade() { // final significa que as subclasses não poderão sobrepor (funciona para classes também)
        System.out.println("Pagando mensalidade de aluno " + super.getNome());
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
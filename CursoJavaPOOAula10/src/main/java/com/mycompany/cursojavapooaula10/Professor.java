package com.mycompany.cursojavapooaula10;

public class Professor extends Pessoa {
    private String especialidade;
    private double salario;
    
    public Professor() {
        
    }

//    public Professor(String nome, int idade, char sexo, String especialidade, double salario) {
//        super(nome, idade, sexo);
//        this.setEspecialidade(especialidade);
//        this.setSalario(salario);
//    }
    
    public void receberAumento(double salario) {
        this.setSalario(this.getSalario() + salario);
    }
   
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

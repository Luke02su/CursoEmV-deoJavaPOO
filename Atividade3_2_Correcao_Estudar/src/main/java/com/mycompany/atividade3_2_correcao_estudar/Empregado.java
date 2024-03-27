package com.mycompany.atividade3_2_correcao_estudar;

public class Empregado {

    private String nome;
    private String sobrenome;
    private double salario;

    public Empregado(String nome, String sobrenome, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = nome;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    private double salarioAnual() {
        return this.salario * 12;
    }

    public void imprimirSalarioAnual() {
        System.out.println("Nome: " + this.nome + " " + this.sobrenome);
        System.out.println("Salário anual: " + this.salarioAnual());
    }
    
    /* Aumenta o salário em 10% */
    public void aumentarSalario() {
        this.salario *= 1.1;
    }
    
    public void aumentarSalarioPorcentagem(double porcentagem) {
       //  this.setSalario(this.getSalario() + (this.getSalario() * (porcentagem / 100))) ;
        this.salario += (this.salario * (porcentagem / 100));
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + " " + this.getSobrenome() + "\n"
                + "Salário mensal: " + this.getSalario();
    }    

    
}

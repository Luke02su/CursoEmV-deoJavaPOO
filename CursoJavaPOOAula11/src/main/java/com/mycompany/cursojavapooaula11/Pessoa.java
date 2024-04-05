package com.mycompany.cursojavapooaula11;

public abstract class Pessoa {
    private String nome;
    private int idade;
    private char sexo;
   
    public final void fazerAniver() { // não pode ser sobreposto em uma subclasse
        this.setIdade(this.getIdade() + 1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Dados: Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
}
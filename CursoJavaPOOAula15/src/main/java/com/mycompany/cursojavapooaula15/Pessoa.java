package com.mycompany.cursojavapooaula15;

public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected char sexo;
    protected int experiencia;
    
    public Pessoa() {
    
    };

    public Pessoa(String nome, int idade, char sexo, int experiencia) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
        this.setExperiencia(experiencia);
    }
      
    protected abstract void ganharExp(int experiencia);

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", experiencia=" + experiencia + '}';
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

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
}

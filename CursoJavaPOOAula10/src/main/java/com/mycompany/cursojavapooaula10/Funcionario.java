package com.mycompany.cursojavapooaula10;

public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;

    public Funcionario(String nome, int idade, char sexo, String setor, boolean trabalhando) {
        super(nome, idade, sexo);
        this.setSetor(setor);
        this.setTrabalhando(trabalhando);
    }

    public void mudarTrabalho(String mudarTrabalho) {
    
        System.out.println("----- MUDANÇA DE TRABALHO REALIZADA");
        System.out.println("Trabalho anterior: " + this.getSetor());
        this.setSetor(mudarTrabalho);
    }
    
    public String getSetor() {
        return this.setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return this.trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }  
}

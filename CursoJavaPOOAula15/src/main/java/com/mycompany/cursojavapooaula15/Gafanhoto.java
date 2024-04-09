package com.mycompany.cursojavapooaula15;

public class Gafanhoto extends Pessoa {
    private String login;
    private int totAssistido;

    public Gafanhoto() {
    
    };
    
    public Gafanhoto(String nome, int idade, char sexo, int experiencia, String login, int totAssistido) {
        super(nome, idade, sexo, experiencia);
        this.setLogin(login);
        this.setTotAssistido(totAssistido);
    }
    
    @Override
    protected void ganharExp(int experiencia) {
        System.out.println("--- ADQUIRIU MAIS EXPERIÊNCIA ---");
        super.setExperiencia(this.getExperiencia() + experiencia);
        System.out.println("Experiência adquirida: " + experiencia + "\nExperiência totalizada: " + this.getExperiencia());
        System.out.println();
    }
    
    public void viuMaisUm() {
        System.out.println("--- VIU MAIS UM VÍDEO ---");
        this.setTotAssistido(this.getTotAssistido() + 1);
        System.out.println("Total de vídeos assistidos: " + this.getTotAssistido());
        System.out.println();
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + "login=" + login + ", totAssistido=" + totAssistido + '}';
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistiado) {
        this.totAssistido = totAssistiado;
    }
}

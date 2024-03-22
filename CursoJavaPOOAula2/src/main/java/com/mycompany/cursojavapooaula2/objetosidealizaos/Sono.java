package com.mycompany.cursojavapooaula2.objetosidealizaos;

public class Sono {
    public String duracao;
    public String qualidade;
    public boolean acordado;
   
    public void status() {
        System.out.println("Duração: " + this.duracao);
        System.out.println("Qualidade: " + this.qualidade);
    }
    
    public void dormir() {
        this.acordado = false;
    }
    
    public void acordar() {
        this.acordado = true;
    }
    
    public void estudar() {
        if(this.acordado) {
            System.out.println("Pronto para estudar!");
        } else {
            System.out.println("Só mais cinco minutos...");
        }
    }
}

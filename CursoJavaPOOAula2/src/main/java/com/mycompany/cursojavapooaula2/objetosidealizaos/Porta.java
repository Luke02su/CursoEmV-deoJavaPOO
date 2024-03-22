package com.mycompany.cursojavapooaula2.objetosidealizaos;

public class Porta {
    public String material;
    public double altura;
    public double largura;
    public boolean fechada;
    
    public void status() {
        System.out.println("Material: " + this.material);
        System.out.println("Altura: " + this.altura);
        System.out.println("Largura: " + this.largura); 
        System.out.println("A porta está fechada? " + this.fechada);
    }
    
    public void abrir() {
        this.fechada = false;
    }
    
    public void fechar() {
        this.fechada = true;
    }
    
    public void baterNaPorta() {
        if(this.fechada) {
            System.out.println("Batendo na porta. TOC TOC!");
        } else {
            System.out.println("Bata somente com a porta fechada.");
        }
    }
}

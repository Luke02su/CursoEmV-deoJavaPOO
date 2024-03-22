
package com.mycompany.cursojavapooaula2;

public class Caneta {
    public String modelo;
    public String cor;
    public float ponta;
    public int carga;
    public boolean tampada;
    
    void status() {
        System.out.println("Modelo " + this.modelo);
        System.out.println("Uma caneta " + cor);
        System.out.println("Ponta " + this.ponta);
        System.out.println("Carga " + this.carga);
        System.out.println("Está tampada? " + tampada);
    }
    
    public void rabiscar() {
        if(this.tampada) {
            System.out.println("ERRO: Não posso rabiscar.");
        } else {
            System.out.println("Estou rabiscando.");
        }
    }
    
    public void tampar() {
        this.tampada = true;
        
    }
    
    public void destampar() {
        this.tampada = false;
    }
}

package com.mycompany.cursopoojavaaula03;

public class Caneta {
    public String modelo;
    public String cor; // todas as classes tem acesso
    private float ponta; // somente a classe mãe tem acesso
    protected int carga; //classe (mãe) e subclasses (filhas) tem acesso
    private boolean tampada; // quando não definido, inicializa por padrão com valor falso
    
    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
        
    }
    public void tampar() {
        this.tampada = true;
    }
    
    public void destampar() {
        this.tampada = false; // método public pegando atributo privado para ser usado na classe principal. Como o valor booleano pertence a esta classe, funciona!
    }
    
    public void rabiscar() {
        if(this.tampada){
            System.out.println("ERRO: Caneta tampada.");
        } else {
            System.out.println("Rabiscandoooo!"); 
        }
    }
}

package com.mycompany.cursopoojavaaula04;

public class Caneta {
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
    
// Feito manualmente   
//    public Caneta(String m, float p, String c, boolean t){ // método construtor (pode usar só o nome da classe também)
//        this.setModelo(m); // ou this.modelo = m;
//        this.setPonta(p);
//        this.setCor(c);
//        this.setTampada(t);
//    }
//
//    public String getModelo() {
//        return this.modelo;
//    }
//    
//    public void setModelo(String m){
//        this.modelo = m;
//    }
//    
//    public float getPonta() {
//        return this.ponta;
//    }
//    
//    public void setPonta(float p) {
//        this.ponta = p;
//    }
//    
//    public String getCor() {
//        return this.cor;
//    }
//    
//    public void setCor(String c) {
//        this.cor = c;
//    }
//    
//    public boolean getTampada() {
//        return this.tampada;
//    }
//    
//    public void setTampada(boolean t) {
//        this.tampada = t;
//    }
//    
//    public void tampar() {
//        this.tampada = true;
//    }
//    
//    public void destampar() {
//        this.tampada = false;
//    }
//    
//    
//    public void status() {
//        System.out.println("Sobre a caneta: ");
//        System.out.println("Modelo: " + this.getModelo()); // this.modelo == this.getModelo();
//        System.out.println("Ponta: " + this.getPonta()); // this.modelo == this.getPonta();
//        System.out.println("Cor: " + this.getCor());
//        System.out.println("Tampada? " + this.getTampada());
//    }

    
    // feito usasando alt + insert
    public Caneta(String modelo, float ponta, String cor, boolean tampada) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.cor = cor;
        this.tampada = tampada;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isTampada() { // poderia usar getTampada(), mas o ideal para valores booleanos é usar isTampada()
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }    
}

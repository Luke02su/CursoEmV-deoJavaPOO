package com.mycompany.cursojavapooaula05;

public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //Métodos especiais
    
    public void ContaBanco() { // pode ser só o nome ou só public ContaBanco
        this.setSaldo(0); // ou this.saldo = 0;
        this.setStatus(false); // ou this.Status = false 
    }
    
    public int getNumConta() {
        return this.numConta;
    }
    
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    
    public String getTipo() {
        return this.tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public float getSaldo() {
        return this.saldo;
    }
    
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }    
    
    public boolean isStatus() {
        return this.status;
    }
    
    public void setStatus(boolean status) {
        this.status = status;
    }
   
    //Métodos personalizados
    public void estadoAtual() {
        System.out.println("\nConta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
    }
    
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true); // método modificador (preferencia para este)
       // this.status = true; // acesso direto do atributoo
       
        if (t == "CC") {
            this.setSaldo(50);
        } else if (t == "CP") {
            this.setSaldo(150); // ideal acessar metodo ao ives do atributo
        }
    }
    
    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada pois há saldo.");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta não pode ser fechada.");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    
    public void depositar(float v) {
        if (this.isStatus()) {
            // this.saldo = this.saldo + v;
            this.setSaldo(this.getSaldo() + v); // ideal
            System.out.println("Depósito realizado na conta de " + this.getDono());
        } else {
            System.out.println("Impossível depositar em uma conta!");
        }
    }
    
    public void sacar(float v) {
        if(this.isStatus())  {
            if(this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficienre para saque.");
            } 
        } else {
            System.out.println("Impossível criar uma conta fechada.");    
         }
    }
    
    public void pagarMensal() {
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        } else {
            System.out.println("Impossível pagar uma conta fechada.");
        }
    }
}

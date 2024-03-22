package com.mycompany.cursojavapooaulaexemplopratico;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public ContaBanco(int numConta, String tipo, String dono, double saldo, boolean status) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = saldo;
        this.status = status;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void abrirConta() {
        this.status = true;
        
        if(this.tipo == "cc") {
            this.saldo += 50.0;
        } else if (this.tipo == "cp") {
            this.saldo += 150.0;
        }
    }
    
    public void fecharConta() {
        if(this.status == true) {
            if(this.saldo > 0) {
                sacar(this.saldo);
                this.status = false;
            } else {
                System.out.println("Erro: Você está em débito.");
            }
        }
    }
    
    public void depositar(double deposito) {
        if(this.status == true) {
            this.saldo += deposito;
        }
    }
    
    public void sacar(double saque) {
        if(this.status == true) {
            if(this.saldo > 0 && this.saldo >= saque) {
                this.saldo -= saque;
            } 
        }
    }
    
    public void pagarMesal() {
        if(this.status = true) {
            if(this.tipo == "cc") {
                this.saldo -= 12.00; 
            } else if (this.tipo == "cp") {
                this.saldo -= 20.00;
            }
        }
    }
    
    public void status() {
        System.out.println("Número da conta: " + this.numConta);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Dono: " + this.dono);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Aberta? " + this.status);
    }
}

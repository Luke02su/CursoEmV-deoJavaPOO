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
        if(!this.status) {
            System.out.println("\n--- CONTA ABERTA---");
            if("cc".equals(this.tipo)) { // compare string assim
                this.saldo += 50.0;
                System.out.println("Bonificação por ter criado uma conta corrente" + "(" + this.tipo + ")" + ": R$50.00");
            } else if ("cp".equals(this.tipo)) {
                this.saldo += 150.0;
                System.out.println("Bonificação por ter criado uma conta poupanca" + "(" + this.tipo + ")"+ ": R$150.00");
            }
        }
        System.out.println();
        this.status = true;
    }
    
    public void fecharConta() {
        if(this.status) {
            if(this.saldo >= 0) {
                sacar(this.saldo);
                System.out.println("--- CONTA FECHADA ---");
                this.status = false;
            } else {
                System.out.println("Erro! Você está em débito no valor de R$" + this.saldo);
               
            }
        } else {
            System.out.println("--- CONTA NÃO ABERTA ---");
        }
        System.out.println();
    }
    
    public void depositar(double deposito) {
        if(this.status == true) {
            System.out.println("--- DEPOSITADO ---");
            this.saldo += deposito;
            System.out.println("Valor depositado: " + deposito);
            System.out.println("Valor atual do saldo: " + this.saldo);
        }
        System.out.println();
    }
    
    public void sacar(double saque) {
        if(this.status == true) {
            if(this.saldo > 0 && this.saldo >= saque) {
                System.out.println("--- SACADO ---");
                this.saldo -= saque;
                System.out.println("Valor sacado: " + saque);
                System.out.println("Valor atual do saldo: " + this.saldo);
            } else {
                System.out.println("ERRO: Saque acima do saldo.");
            }
        } 
        System.out.println();
    }
    
    public void pagarMesal() {
        if(this.status) {
            System.out.println("--- MENSALIDADE PAGA ---");
            if("cc".equals(this.tipo)) {
                this.saldo -= 12.00; 
                System.out.println("Mensalidade da conta corrente " + "(" + this.tipo + ")" + ": R$12.00");
            } else if ("cp".equals(this.tipo)) {
                this.saldo -= 20.00;
                System.out.println("Mensalidade da conta poupança " + "(" + this.tipo + ")" + ": R$50.00");
            }
        } else {
            System.out.println("Crie uma conta para pagar mensalidade.");
        }
        System.out.println();
    }
    
    public void status() {
        System.out.println(" --- ESTADO DA CONTA ---");
        System.out.println("Número da conta: " + this.numConta);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Dono: " + this.dono);
        System.out.println("Saldo R$" + this.saldo);
        System.out.println("Aberta? " + this.status);
        System.out.println();
    }
}
package com.mycompany.trabalho01;

public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String inscricaoEstadual;
    private double faturamentoMensal;
    private int faixa;
    private int numeroFuncionarios;

public PessoaJuridica(String nome, String endereco, String telefone, int codigo, String cnpj, String inscricaoEstadual, double faturamentoMensal, int faixa, int numeroFuncionarios) {
        super(nome, endereco, telefone, codigo);
        this.setCnpj(cnpj);
        this.setInscricaoEstadual(inscricaoEstadual);
        this.setFaturamentoMensal(faturamentoMensal);
        this.setFaixa(faixa);
        this.setNumeroFuncionarios(numeroFuncionarios);
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return this.inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public double getFaturamentoMensal() {
        return this.faturamentoMensal;
    }

    public void setFaturamentoMensal(double faturamentoMensal) {
        this.faturamentoMensal = faturamentoMensal;
    }

    public int getFaixa() {
        return this.faixa;
    }

    public void setFaixa(int faixa) {
        this.faixa = faixa;
    }

    public int getNumeroFuncionarios() {
        return this.numeroFuncionarios;
    }

    public void setNumeroFuncionarios(int numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }
    
    public void imprimirdados() {
        
    }
    
    private double calcularFaturamentoanual() {
        return 0;
    }
    
    private int definirFaixa(double faturamentoAnual) {
        return 0;
    }
    
    public void imprimirFaturamentoAnual() {
        
    }
    
    public void alterarFaturamento(double valor) {
        
    }
    
    public void gerarGuiaPagamento() {
        
    }
}

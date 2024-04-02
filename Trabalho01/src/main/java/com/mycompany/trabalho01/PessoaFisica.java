package com.mycompany.trabalho01;
import java.util.Date;

public class PessoaFisica extends Pessoa {
    private String nomePai;
    private String nomeMae;
    private char sexo;
    private Date dataNascimento;
    private String cpf;
    private String rg;
    private String nacionalidade;
    private String naturalidade;
    private double salario;

    public PessoaFisica(String nome, String endereco, String telefone, int codigo, String nomePai, String nomeMae, char sexo, Date dataNascimento, String cpf, String rg, String nacionalidade, String naturalidade, double salario) {
        super(nome, endereco, telefone, codigo);
        this.setNomePai(nomePai);
        this.setNomeMae(nomeMae);
        this.setSexo(sexo);
        this.setDataNascimento(dataNascimento);
        this.setCpf(cpf);
        this.setRg(rg);
        this.setNacionalidade(nacionalidade);
        this.setNaturalidade(naturalidade);
        this.setSalario(salario);
    }

    public String getNomePai() {
        return this.nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return this.nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public char getSexo() {
        return this.sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Date getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return this.rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNaturalidade() {
        return this.naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void imprimirDados() {
        System.out.println("----- DADOS DE PESSOA FÍSICA -----");
        System.out.println("Código: " + super.getCodigo());
        System.out.println("Nome: " + super.getNome());
        System.out.println("Endereço: " + super.getEndereco());
        System.out.println("Telefone: " + super.getTelefone());
        System.out.println("Nome do pai:" + this.getNomePai());
        System.out.println("Nome da mãe:" + this.getNomeMae());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Data de nascimento: " + this.getDataNascimento());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("RG: " + this.getRg());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println("Naturalidade: " + this.getNaturalidade());
        System.out.println("Salário: R$" + this.getSalario());
        System.out.println();
    }
    
    public void exibirSalarioAnual() {
        System.out.println("----- SALÁRIO ANUAL DE PESSOA FÍSICA -----");
        System.out.println("Nome: " + super.getNome());
        System.out.println("Salário: R$" + this.calcularSalarioAnual());
        //System.out.println("Salário: R$" + this.getSalario());
        System.out.println();
    }
    
    public void aumentarSalario(double porcentagem) {
        System.out.println("--- AUMENTO DE SALÁRIO POR PORCENTAGEM DE PESSOA FÍSICA -----");
        this.setSalario(this.getSalario() + (this.getSalario() * (porcentagem / 100)));
        System.out.println("Salário anual atual após aumento de " + porcentagem + "%: R$" + this.getSalario());
        System.out.println();
    }
    
    public void aumentarSalario(int valor) {
        System.out.println("----- AUMENTO DE SALÁRIO POR VALOR DE PESSOA FÍSICA -----");
        this.setSalario(this.getSalario() + valor);
        System.out.println("Sálario anual atual após aumento de R$" + valor + ": R$" + this.getSalario());
        System.out.println();
    }
    
    private double calcularSalarioAnual() {
        return this.getSalario() * 12;
    }
    
    public void temQuePagar(double salarioAnual) {
        if(salarioAnual > 22847.88) {
            System.out.println("Terá de pagar Imposto de Renda (IR). Valor a ser pago: R$" + this.calcularIR(salarioAnual));
        } else {
            System.out.println("Não terá que pagar Imposto de Renda (IR).");
        }
    }
    
    private double calcularIR(double salarioAnual) {
        this.setSalario(salarioAnual / 12);
        
        if(this.getSalario() >= 1903.99 && this.getSalario() <= 2826.65) {
            return this.salario *=  0.075;
        } else if(this.getSalario() >= 2826.66 && this.getSalario()<= 3751.05) {
            return this.salario  *=  0.15;
        } else if(this.getSalario() >= 3751.06 && this.getSalario() <= 4664.68){
            return this.salario *= 0.225;
        } else {
            return this.salario *= 0.275;
        }
    }
    
    public void imprimePrestacaoIR(int parcelas, double valorImposto) {
       // if()
//        imprimePrestacaoIR(pestacao, valorImposto): Recebe a quantidade de parcelas e o valor do 
//imposto e imprime o valor de cada parcela. Lembrando que o número máximo de parcelas é 8 e o 
//mínimo é 2. 
    }
}

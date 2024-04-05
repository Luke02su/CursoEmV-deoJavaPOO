package com.mycompany.cursojavapooaula11;

public class Bolsista extends Aluno { // herança para diferença
    private float bolsa;
    
    public void renovarBolsa() {
        System.out.println("Renovando bolsa de " + this.getNome());
    }

    @Override // sobrepor pagarMensalidade da classe Aluno 
    public void pagarMensalidade() { // polimorfismo (método age de forma diferente nesta classe comparado com a Aluno (pai)
        System.out.println(super.getNome() + " é bolsista! Pagamento facilitado!");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

}
package com.mycompany.cursopoojavaaula07;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
    //Métodos especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria(); // sem parâmetro, importante usar no construtor
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() { // categoria não será usado (sem parâmetro)
        if(this.getPeso() < 52.2) { // se getPeso ou this.peso
            this.categoria = "Inválido"; // neste caso deve atribuir diretamente ao atributo this.categoria, pois está dentro do setCategoria, o que impossibilita seu uso
        } else if(this.getPeso() <= 70.3) {
            this.categoria = "Leve";
        } else if(this.getPeso() <= 83.9) {
            this.categoria = "Médio";
        } else if(this.getPeso() <= 120.2) {
            this.categoria = "Pesado";
        } else if (this.getPeso() <= 141.9) {
            this.categoria = "Super pesado";
        } else {
            System.out.println("Inválido");
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    //Métodos Públicos
    public void apresentar() { // apresentação inicial
        System.out.println("----- CHEGOU A HORA! -----");
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println(this.getIdade() + " anos");
        System.out.println(this.getAltura() + " m de altura");
        System.out.println("Pesando " + this.getPeso() + "Kg");
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Ganhou: " + this.getVitorias());
        System.out.println("Perdeu: " + this.getDerrotas());
        System.out.println("Empatou: " + this.getEmpates());
    }
    
    public void status() { // apresentação resumida
        System.out.println(this.getNome());
        System.out.println("Peso " + this.getCategoria());
        System.out.println(this.getVitorias() + " vitória(s)");
        System.out.println(this.getDerrotas() + " derrota(s)");
        System.out.println(this.getEmpates() + " empate(s)");
    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
        //this.vitorias += 1;
    }        
    
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }
    
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
}
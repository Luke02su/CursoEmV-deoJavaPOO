package com.mycompany.cursojavapooaula09;

import java.util.Random;

public class Livro implements Publicacao { // implementação de métodos da interface Publicacao (interface é semelhante a uma classe abstrata, mas não implementa nada)
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    public void detalhes() { // poderia se utilizar toString()
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Total de páginas: " + this.getTotPaginas());
        System.out.println("Página atual: " + this.getPagAtual());
        System.out.println("Aberto? " + this.isAberto());
        System.out.println("Leitor: " + this.leitor.getNome());
        System.out.println("Idade: " + this.leitor.getIdade());
        System.out.println("Sexo: " + this.leitor.getSexo());
        
        System.out.println();
    }

    @Override
    public void abrir() {
        if(!this.isAberto()) {
            this.setAberto(true);
            System.out.println("Livro aberto por " + this.leitor.getNome()); // // necessidade de inicializar no construtor o objeto advindo da classe Pessoa (se fosse método acessava normal)
        } else {
            System.out.println("Livro já está aberto.");
        }
        System.out.println();
    }

    @Override
    public void fechar() {
         if(this.isAberto()) {
             this.setAberto(false);
             System.out.println("Livro fechado por " + this.leitor.getNome()); // necessidade de inicializar no construtor o objeto advinda da classe Pessoa (se fosse método acessava normal)
         } else {
             System.out.println("Livro já está fechado.");
         }
         System.out.println();
    }

    @Override
    public void folhear(int folhear) {
        if(folhear <= this.totPaginas) {
            this.setPagAtual(folhear);
            if(this.isAberto()) {
                System.out.println("Livro folheado. Página atual " + this.getPagAtual());
            } else {
                System.out.println("Livro está fechado. Não se pode folheá-lo.");
            }
        } else {
            this.setPagAtual(0);
            System.out.println("Está excedendo o número de páginas do livro.");
        }
        System.out.println();
    }

    @Override
    public void avancarPag() {
        if(this.isAberto()) {
            if(this.getPagAtual() < this.getTotPaginas()) {
                this.setPagAtual(this.getPagAtual() + 1);
                System.out.println("Página avançada. Página atual: " + this.getPagAtual());
            } else {
                System.out.println("Não se pode avançar página.");
            }
        } else {
            System.out.println("Livro está fechado.");
        }
        System.out.println();
    }

    @Override
    public void voltarPag() {
        if(this.isAberto()) {
            if(this.getPagAtual() > 0) {
                this.setPagAtual(this.getPagAtual() - 1);
                System.out.println("Página retrocedida.Página atual: " + this.getPagAtual());
            } else {
                System.out.println("Não se pode retroceder página.");
            }
        } else {
            System.out.println("Livro está fechado.");
        }
        System.out.println();
    }
}

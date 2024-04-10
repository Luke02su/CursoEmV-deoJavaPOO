package com.mycompany.cursojavapooaula15;

public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(){
    
    };
    
    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.setEspectador(espectador);
        this.setFilme(filme);
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }
    
    public void avaliar() {
        System.out.println("VÍDEO PRÉ-AVALIADO ---");
        this.filme.setAvaliacao(5);
        System.out.println("Nota default: " + this.filme.getAvaliacao());
        System.out.println();
    }
    
    public void avaliar(int nota) {
        System.out.println("--- VÍDEO AVALIADO POR NOTA ---");
        this.filme.setAvaliacao(nota);
        System.out.println("A avaliação de " + this.espectador.getNome() + " para o vídeo " + this.filme.getTitulo() + ": " + this.filme.getAvaliacao());
        System.out.println();
    }
    
    public void avaliar(float porc) {
        System.out.println("--- VÍDEO AVALIADO POR PORCENTAGEM DO VÍDEO ASSISTIDO ---");
        int tot = 0;
        if(porc <= 20.00) {
            tot = 3;
        } else if(porc <= 50.00) {
            tot = 5;
        } else if(porc <= 90.00) {
            tot = 8;
        } else {
            tot = 10;
        }    
        this.filme.setAvaliacao(tot);
        System.out.println("A porcentagem " + porc + " do vídeo assistido pelo " + this.espectador.getNome() + " equivale a uma nota de: " + this.filme.getAvaliacao());
        System.out.println();
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
    
    public Gafanhoto getEspectador() {
        return this.espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return this.filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }
}
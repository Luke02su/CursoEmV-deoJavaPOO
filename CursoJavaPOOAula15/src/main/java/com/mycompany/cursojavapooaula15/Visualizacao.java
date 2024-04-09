package com.mycompany.cursojavapooaula15;

public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(){
    
    };
    
    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.setEspectador(espectador);
        this.setFilme(filme);
        this.espectador.setTotAssistidos(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filmes.getViews() + 1);
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
   
    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    public void avaliar() {
        System.out.println("VÍDEO PRÉ-AVALIADO ---");
        if(this.espectador.getLogin() != null) {
            System.out.println("Adorei a vídeoaula, aprendi muito vendo e praticando!");
        } else {
            System.out.println("Não prestei atenção nem pus em prática a vídeoaula, por isso não entendendo nada de Java nem POO...");
        }
        System.out.println();
    }
    
    public void avaliar(double nota) {
        System.out.println("--- VÍDEO AVALIADO POR NOTA (1 a 10) ---");
        if(this.espectador.getLogin() != null) {
            System.out.println("Nota de " + this.espectador.getNome() + " para o vídeo " + this.filme.getTitulo() + ": " + nota);
        }
        System.out.println();
    }
    
    public void avaliar(float porc) {
        System.out.println("--- VÍDEO AVALIADO POR PORCENTAGEM (1 a 100) ---");
        if(this.espectador.getLogin() != null) {
            System.out.println("Nota em porcentagem de + " + this.espectador.getNome() + " para o vídeo " + this.filme.getTitulo() + ": " + porc);
        }
        System.out.println();
    }
}

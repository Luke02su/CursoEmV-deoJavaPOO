package com.mycompany.cursojavapooaula15;

public class Video implements AcoesVideo {
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    
    public Video() {
        
    };

    public Video(String titulo) {
        this.setTitulo(titulo);
        this.setAvaliacao(1);
        this.setViews(0);
        this.setCurtidas(0);
        this.setReproduzindo(false);
    }
    
    @Override
    public void play() {
        System.out.println("--- VÍDEO INICIADO ---\n");
        this.setReproduzindo(true);
    }
    
    @Override
    public void pause() {
        System.out.println("--- VÍDEO PAUSADO ---\n");
        this.setReproduzindo(false);
    }
    
    @Override
    public void like(int like) {
        System.out.println(" --- LIKE(S) ADICIONADOS ---");
        this.setCurtidas(this.getCurtidas() + like);
        System.out.println("Likes adicionados: " + like + "\nTotal de likes: " + this.getCurtidas());
        System.out.println();
    }

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", curtidas=" + curtidas + ", reproduzindo=" + reproduzindo + '}';
    }
   
    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getAvaliacao() {
        return this.avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        if(this.getViews() > 0) {
            int nova;
            nova = (int)((this.avaliacao + avaliacao)/this.getViews()); // media baseado na avaliação antiga e atual do vídeo e na sua quantidade de views
            this.avaliacao = nova;
        }
    }

    public int getViews() {
        return this.views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return this.curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return this.reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
}

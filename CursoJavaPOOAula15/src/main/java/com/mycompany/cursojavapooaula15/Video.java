package com.mycompany.cursojavapooaula15;

public class Video implements AcoesVideo {
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    
    public Video() {
        
    };

    public Video(String titulo, int avaliacao, int views, int curtidas, boolean reproduzindo) {
        this.setTitulo(titulo);
        this.setAvaliacao(avaliacao);
        this.setViews(views);
        this.setCurtidas(curtidas);
        this.setReproduzindo(reproduzindo);
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
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
}

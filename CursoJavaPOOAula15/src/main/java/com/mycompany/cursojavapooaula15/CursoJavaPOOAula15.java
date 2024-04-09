package com.mycompany.cursojavapooaula15;

public class CursoJavaPOOAula15 {

    public static void main(String[] args) {
        
        //AcoesVideo = interface p/ Video
        //Pessoa = classe abstrata na qual Gafanhoto é sua subclasse
        Gafanhoto gafanhoto = new Gafanhoto("Lucas", 19, 'M', 8, "Lucao", 3);
        Video video = new Video("Aula 15b", 0, 0, 0, true);
        Visualizacao visualizacao = new Visualizacao(gafanhoto, video);
        
        video.like(10);
        video.play();
        video.pause();
        
        video.setReproduzindo(false);
        gafanhoto.ganharExp(9);
        gafanhoto.viuMaisUm();
        
        visualizacao.avaliar();
        visualizacao.avaliar(10.00);
        visualizacao.avaliar(100.0f);
        
        System.out.println(visualizacao.toString());
    }
}

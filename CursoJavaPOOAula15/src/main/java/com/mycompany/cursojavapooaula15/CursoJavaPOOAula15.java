package com.mycompany.cursojavapooaula15;

public class CursoJavaPOOAula15 {

    public static void main(String[] args) {
        
        //AcoesVideo = interface p/ Video
        //Pessoa = classe abstrata na qual Gafanhoto é sua subclasse
        Video video[] = new Video[5];
        
        video[0] = new Video("Aula 1a");
        video[1] = new Video("Aula 4a");
        video[2] = new Video("Aula 2b");
        video[3] = new Video("Aula 12a");
        video[4] = new Video("Aula 15b");
        
        Gafanhoto gafanhoto[] = new Gafanhoto[5];
        
        gafanhoto[0] = new Gafanhoto("Lucas", 19, 'M', "Lucao");
        gafanhoto[1] = new Gafanhoto("João", 18, 'M', "Jao");
        gafanhoto[2] = new Gafanhoto("Maria", 20, 'F', "Marao");
        gafanhoto[3] = new Gafanhoto("Ana", 23, 'F', "Anao");
        gafanhoto[4] = new Gafanhoto("Raphael", 21, 'M', "Raphao");
        
        System.out.println("--- VÍDEOS ---\n");
        System.out.println(video[0].toString());
        System.out.println(video[1].toString());
        System.out.println(video[2].toString());
        System.out.println(video[3].toString());
        System.out.println(video[4].toString());
        System.out.println();
        
        System.out.println("--- GAFANHOTOS ---");
        System.out.println(gafanhoto[0].toString());
        System.out.println(gafanhoto[1].toString());
        System.out.println(gafanhoto[2].toString());
        System.out.println(gafanhoto[3].toString());
        System.out.println(gafanhoto[4].toString());
        System.out.println();
        
        Visualizacao visualizacao[] = new Visualizacao[5];
        
        visualizacao[0] = new Visualizacao(gafanhoto[0], video[0]);
        visualizacao[1] = new Visualizacao(gafanhoto[1], video[0]);
        visualizacao[2] = new Visualizacao(gafanhoto[4], video[1]);
        visualizacao[3] = new Visualizacao(gafanhoto[4], video[1]);
        visualizacao[4] = new Visualizacao(gafanhoto[4], video[1]);
        
        System.out.println();
        System.out.println(visualizacao[4].toString());
        System.out.println();
       
        video[2].like(10);
        video[1].play();
        video[4].pause();
        
        video[2].setReproduzindo(false);
        gafanhoto[0].ganharExp(9);
        gafanhoto[1].viuMaisUm();
        
        visualizacao[1].avaliar();
        visualizacao[2].avaliar(9);
        visualizacao[0].avaliar(100.0f);
        
        System.out.println();
        System.out.println(visualizacao[1].toString());
        System.out.println(visualizacao[2].toString());
        System.out.println(visualizacao[0].toString());
    }
}

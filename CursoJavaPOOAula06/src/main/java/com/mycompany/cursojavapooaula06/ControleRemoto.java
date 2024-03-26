package com.mycompany.cursojavapooaula06;

public class ControleRemoto implements Controlador { // insere a interface
    
    private int volume;
    private boolean ligado;
    private boolean tocando;
    private boolean menuAberto;

    public ControleRemoto() {
        this.setVolume(0);
        this.setLigado(false);
        this.setTocando(false);
        this.setMenuAberto(false);
    }

    //Métodos especiais
    private int getVolume() { // privado não pode usar get e set dentro da classe principal
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    private boolean isMenuAberto() {
        return menuAberto;
    }

    private void setMenuAberto(boolean menu) {
        this.menuAberto = menu;
    }
    
    //Métodos abstratos

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if(this.isLigado()) {
            System.out.println("----- MENU -----");
            System.out.println("Está ligado? " + this.isLigado());
            System.out.println("Está tocando? " + this.isTocando());
            System.out.print("Volume: " + this.getVolume());

            for(int i = 1; i <=  this.getVolume(); i+=10) {
                System.out.print("|");
            }
            System.out.println();
        } else {
            System.out.println("TV está desligada.");
        }
    }

    @Override
    public void fecharMenu() {
        if(this.isLigado() && this.isMenuAberto())  {
            System.out.println("Fechando menu...");
        } else {
            System.out.println("Menu já está fechado.");
        }
    }

    @Override
    public void maisVolume() {
        if(this.isLigado() && this.getVolume() < 100) {
            this.setVolume(this.getVolume() + 5);
        } else {
            System.out.println("Impossível aumentar volume.");
        }
    }

    @Override
    public void menosVolume() {
        if(this.isLigado() && this.getVolume() > 0) {
            this.setVolume(this.getVolume() - 5);
        } else {
            System.out.println("Impossível diminuir volume.");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.isLigado() && this.getVolume() > 0) { 
            this.setVolume(0);
        } else if (!(this.isLigado())){
            System.out.println("Televisão desligada.");
        } else if (this.isLigado() && this.getVolume() == 0) {
            System.out.println("Volume já está mutado.");
        }
    }

    @Override
    public void desligarMudo() {
        if(this.isLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.isLigado() && !this.isTocando()) {
            this.setTocando(true);
        } else {
            System.out.println("Não consegui reproduzir.");
        }
    }

    @Override
    public void pause() {
        if(this.isLigado() && this.isTocando()) {
            this.setTocando(false);
        } else {
            System.out.println("Não consegui pausar.");
        }
    }
}

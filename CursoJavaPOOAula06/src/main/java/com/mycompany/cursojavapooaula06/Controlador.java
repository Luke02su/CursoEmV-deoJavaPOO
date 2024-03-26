package com.mycompany.cursojavapooaula06;

public interface Controlador {
    
    //métodos abstrados não abre chaves, funciona apenas como uma lista
    
    public abstract void ligar();
    public abstract void desligar();
    public abstract void abrirMenu();
    public abstract void fecharMenu();
    public abstract void maisVolume();
    public abstract void menosVolume();
    public abstract void ligarMudo();
    public abstract void desligarMudo();
    public abstract void play();
    public abstract void pause();
 
}

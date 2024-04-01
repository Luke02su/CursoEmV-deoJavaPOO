package com.mycompany.cursojavapooaula09;

public interface Publicacao { //(interface é semelhante a uma classe abstrata, mas não implementa nada, desnecessáio abstract)
    
    public void abrir();
    public void fechar();
    public void folhear(int folhear);
    public void avancarPag();
    public void voltarPag();
}

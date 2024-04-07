package com.mycompany.cursojavapooaula13;

public class CursoJavaPOOAula13 {

    public static void main(String[] args) {
        
        //Animal a = new Animal(); classe abstrata
        Mamifero m = new Mamifero();
        Cachorro c = new Cachorro();
        
        c.reagir("Olá"); // Abanar e latir. (Polimorfismo de sobrecarga)
        c.reagir("Vai apanhar"); // Rosnar.
        c.reagir(1, 45); // Abanar.
        c.reagir(21, 00); // Ignorar.
        c.reagir(true); // Abanar.
        c.reagir(false); // Rosnar e latir.
        c.reagir(2, 12.5f); // Latir.
        c.reagir(17, 4.5f); // Rosnar.
    }
}

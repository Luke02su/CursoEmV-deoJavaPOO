package com.mycompany.cursopoojavaaula03;

public class CursoPOOJavaAula03 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        
        c1.modelo = "BIG Cristal";
        c1.cor = "Azul";
       // c1.ponta = 0.6f;
        c1.carga = 80;
       // c1.tampada = false;
       
        c1.tampar();
        c1.status();
        c1.rabiscar();
    }
    }
}

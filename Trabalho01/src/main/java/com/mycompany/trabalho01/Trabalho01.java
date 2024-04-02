package com.mycompany.trabalho01;
import java.util.Date;

public class Trabalho01 {

    public static void main(String[] args) {
        
        //Pessoa p1 = new Pessoa("José Aparecido", "Rua X", "(34) 9 9833-6738", 1);
        Date dataNascimento = new Date(99, 9, 9);
        PessoaFisica pf1 = new PessoaFisica("José Aparecido", "Rua X", "(34) 9 9833-6738", 1, "Manoel Aparecido", "Maria Aparecida", 'M', dataNascimento, "123.287.837-08", "MG-21.267.287", "Brasileiro", "Mineiro", 1973.09);
        
//        p1.imprimir();
//        
//        pf1.imprimirDados();
//       // pf1.exibirSalarioAnual();
//       // pf1.aumentarSalario(10.00);
//       // pf1.exibirSalarioAnual();
//        pf1.aumentarSalario(1000);
//        pf1.exibirSalarioAnual();

        pf1.temQuePagar(24000.00);
        
        pf1.imprimirDados();
        pf1.imprimePrestacaoIR(2, 1375.0);
    }
}

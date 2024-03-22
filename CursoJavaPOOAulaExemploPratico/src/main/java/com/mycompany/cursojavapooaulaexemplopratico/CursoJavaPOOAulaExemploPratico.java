package com.mycompany.cursojavapooaulaexemplopratico;
import java.util.Scanner;

public class CursoJavaPOOAulaExemploPratico {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        ContaBanco cliente1 = new ContaBanco(0, "null", "null", 0.00, false);
        int opcao;
        
        do {
            System.out.println("1. Abrir conta\n2. Depositar\n3. Sacar\n4. Pagar mensalidade\n5. Imprimir dados\n6. Fechar conta");
            opcao = scan.nextInt();
            
            switch(opcao) {
                case 1:
                    if(!cliente1.isStatus()) {
                        System.out.print("Número da conta: ");
                        int numero = scan.nextInt();
                        cliente1.setNumConta(numero);
                        
                        System.out.println("Tipo cc/cp:");
                        String tipo = scan.nextLine();
                        scan.nextLine(); // consome a quebra de linha (evita com que pule a leitura do tipo)
                        cliente1.setTipo(tipo);
                        
                        System.out.print("Dono: ");
                        String dono = scan.nextLine();
                        cliente1.setDono(dono);
                        
                        System.out.print("Saldo: ");
                        double saldo = scan.nextDouble();
                        cliente1.setSaldo(saldo);
                        
                        cliente1.abrirConta();
                    }
                    break;
                case 2:
                    if(cliente1.isStatus()) {
                        System.out.print("Digite o valor a depositar: ");
                        double depositar = scan.nextDouble();
                        cliente1.depositar(depositar);
                    } else {
                        opcao = 0;
                    }
                    break;
                case 3:
                    if(cliente1.isStatus()) {
                        System.out.print("Digite o valor a sacar: ");
                        double sacar = scan.nextDouble();       
                        cliente1.sacar(sacar);
                    } else {
                        opcao = 0;
                    }
                        break;
                case 4:
                    cliente1.pagarMesal();
                    break;
                case 5: 
                    cliente1.status();
                    break;
                case 6:
                    cliente1.fecharConta();
                    break;
            }
        } while (opcao != 7);
    }
}
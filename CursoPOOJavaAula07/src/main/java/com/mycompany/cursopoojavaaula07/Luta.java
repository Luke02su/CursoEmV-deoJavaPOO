package com.mycompany.cursopoojavaaula07;
import java.util.Random;

public class Luta { // relacionamento de agregação (uma classe na qual outra classe se relaciona por meio os atributos e métodos de um objeto) 
    private Lutador desafiado; // instância de lutador (tipo abstrato de dado)
    private Lutador desafiante; // instância de lutador (tipo abstrato de dado)
    private int rounds; // tipo primitivo de dado
    private boolean aprovada; // tipo abstrato de dado
    private int empateRound;
    private int desafiadoGanhouRound;
    private int desafianteGanhouRound;
   
    public Luta(int rounds) { // pode ou não ter construtor neste classe (neste caso apenas a quantidade de rounds, mas já poderiamos alocar o desafiante e desafiado diretamente)
        this.rounds = rounds;
    }
    
    //Métodos especiais 
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public int getEmpateRound() {
        return empateRound;
    }

    public void setEmpateRound(int contEmpate) {
        this.empateRound = contEmpate;
    }

    public int getDesafiadoGanhouRound() {
        return desafiadoGanhouRound;
    }

    public void setDesafiadoGanhouRound(int desafiadoGanhouRound) {
        this.desafiadoGanhouRound = desafiadoGanhouRound;
    }

    public int getDesafianteGanhouRound() {
        return desafianteGanhouRound;
    }

    public void setDesafianteGanhouRound(int desafianteGanhouRound) {
        this.desafianteGanhouRound = desafianteGanhouRound;
    }

    
    // Métodos da classe
    public void marcarLuta(Lutador l1, Lutador l2) { // caso alocasse desafiante e desafiado no construtor, aqui não haveria necessidade de parâmetros
        if(l1.getCategoria() == l2.getCategoria() && l1 != l2) { // posso usar getcategoria da classe Lutador
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        } else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
            }
        System.out.println();
    }
    
    public void lutar() {
        if(this.isAprovada()) {
            this.setDesafiadoGanhouRound(0);
            this.setDesafianteGanhouRound(0);
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar(); // usando método do objeto da classe Lutador
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar(); // usando método do objeto da classe Lutador
            
            Random random = new Random();
            
            for(int i = 1; i <= this.getRounds(); i++) {
                System.out.println("Round: " + i); // quantidade de rounds
                int vencedor  = random.nextInt(3); // valor aleatório de 0 a 3

                switch(vencedor) {
                    case 0:
                        System.out.println("Empatou!");
                        this.setEmpateRound(getEmpateRound() + 1);
                        //this.desafiante.empatarLuta(); // no código original não havia rounds 
                        //this.desafiado.empatarLuta();
                        break;

                    case 1: // ganhou desafiado
                        System.out.println("Ganhador do round: desafiado " + this.desafiado.getNome());
                        this.setDesafiadoGanhouRound(getDesafiadoGanhouRound() + 1);
                       // this.desafiado.ganharLuta();
                       // this.desafiante.perderLuta();
                        break;
                    case 2: // ganhou desafiante
                        System.out.println("Ganhador do round: desafiante: " + this.desafiante.getNome());
                        this.setDesafianteGanhouRound(getDesafianteGanhouRound() + 1);
                        //this.desafiante.ganharLuta();
                        //this.desafiado.perderLuta();
                        break;
                }
                System.out.println();
            }
            if(this.getDesafiadoGanhouRound() + this.getEmpateRound() > this.getDesafianteGanhouRound() + this.getEmpateRound()) { // caso o valor dos rounds seja par podera haver problemas para definir quem será o vencedor (rounds vencidos + empates) caso seja a mesma quantidade oara os dois
                System.out.println("Vencedor da luta: desafiado " + this.desafiado.getNome());
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();
            } else if (this.getDesafiadoGanhouRound() + this.getEmpateRound() < this.getDesafianteGanhouRound() + this.getEmpateRound()) {
                System.out.println("Vencedor da luta: desafiante " + this.desafiante.getNome());
                this.desafiante.ganharLuta();
                this.desafiado.perderLuta();
            } else {
                System.out.println("Desfiante e desafiado empataram a luta!");
                this.desafiado.empatarLuta();
                this.desafiante.empatarLuta();
            }
            System.out.println();
        } else {
            System.out.println("Luta não pode acontecer.");
        }
    }
}

// evolução modelo ERR para diagrama de classes (não somente classes)
// existentes várias tipos de relacionamento
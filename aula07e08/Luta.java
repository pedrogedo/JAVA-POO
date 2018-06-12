package aula07e08;

import java.util.Random;

/**
 * Relacionamento de Agregação ("TEM UM").
 * Objetos compostos em Java.
 * @author Pedro
 */
public class Luta {
    
    //Atributos
    private Lutador desafiado; //Uma Luta "TEM UM" lutador desafiador.
    private Lutador desafiante; //Uma Luta "TEM UM" lutador desafiante.
    private int rounds;
    private boolean lutaAprovada;
    
    //Métodos Personalizados.
    
    /**
     * Esse método marca a luta entre o desafiante e desafiado, caso sejam da 
     * mesma categoria e a escolha dos lutadores seja diferentes.
     * @param l1 objeto do tipo lutador.
     * @param l2 objeto do tipo lutador.
     */
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.lutaAprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }else{
            this.lutaAprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    
    /**
     * Quando chamado, esse método apresenta os lutadores e verifica um resultado
     * aleatóriamente para o vencedor. De acordo com o resultado informa que foi o 
     * vencedor e atribui a esse 1 ponto na vitória e 1 ponto na derrota para o 
     * perdedor. Em caso de empate, ambos recebem 1 ponto em empate.
     */
    public void lutar(){
        if (this.lutaAprovada) {
            System.out.println("-------------------------------------------");
            System.out.println("         APRESENTAÇÃO DO LUTADOR 1         ");
            System.out.println("-------------------------------------------");
            this.desafiado.apresentar();
            System.out.println("-------------------------------------------");
            System.out.println("         APRESENTAÇÃO DO LUTADOR 2         ");
            System.out.println("-------------------------------------------");
            this.desafiante.apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0 1 2
            
            System.out.println("-------------------------------------------");
            System.out.println("             RESULTADO DA LUTA             ");
            System.out.println("-------------------------------------------");
            switch(vencedor){
                case 0:
                    System.out.println("Empatou !");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("O vencedor foi o lutador " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 3:
                    System.out.println("O vencedor foi o lutador " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
            
            System.out.println("-------------------------------------------");
            System.out.println("         STATUS DO LUTADOR 1               ");
            System.out.println("-------------------------------------------");
            this.desafiado.status();
            
            System.out.println("-------------------------------------------");
            System.out.println("         STATUS DO LUTADOR 2               ");
            System.out.println("-------------------------------------------");
            this.desafiante.status();
            
        }else{
            System.out.println("A luta não pode acontecer.");
        }
    }
    
    //Métodos Especiais.
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDasafiante() {
        return desafiante;
    }

    public void setDasafiante(Lutador dasafiante) {
        this.desafiante = dasafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isLutaAprovada() {
        return lutaAprovada;
    }

    public void setLutaAprovada(boolean lutaAprovada) {
        this.lutaAprovada = lutaAprovada;
    }
    
}

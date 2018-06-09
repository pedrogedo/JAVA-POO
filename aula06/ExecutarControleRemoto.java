package aula06;

/**
 * Encapsulamento
 * @author Pedro
 */
public class ExecutarControleRemoto {
    
    public static void main(String[] args) {
        
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.aumentarVolume();
        c.abrirMenu();
        
        c.play();
        c.ligarMudo();
        c.abrirMenu();
        c.fecharMenu();
    }
}


package aula04;

/**
 * Métodos Getter, Setter e Construtor.
 * @author Pedro
 */
public class ProgramaPrincipalCaneta4 {
    
    public static void main(String[] args) {
        
        /**
         * Instanciando a Caneta4 e setando valores através do método construtor.
         */
        Caneta4 c1 = new Caneta4("NIC","Vermelha",2.0f);
        c1.status();
        
        Caneta4 c2 = new Caneta4("BIC","Laranja",0.5f);
        c2.status();

        System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
    }
}

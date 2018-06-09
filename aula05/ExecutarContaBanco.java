
package aula05;

/**
 * Exemplo prático
 * @author Pedro
 */
public class ExecutarContaBanco {
    
    public static void main(String[] args) {
        
        ContaBanco conta1 = new ContaBanco();
        System.out.println("------------ Estado Inicial Conta1 --------------");
        System.out.println("STATUS.........: " + conta1.getStatus());
        System.out.println("Saldo..........: " + conta1.getSaldo()+"\n");
        conta1.numeroDaConta = 91034;
        conta1.setDono("Jubileu");
        conta1.abrirConta("CC");
        
        ContaBanco conta2 = new ContaBanco();
        System.out.println("------------ Estado Inicial Conta 2 --------------");
        System.out.println("STATUS.........: " + conta2.getStatus());
        System.out.println("Saldo..........: " + conta2.getSaldo()+"\n");
        conta2.numeroDaConta = 78555;
        conta2.setDono("Creuza");
        conta2.abrirConta("CP");
        
        System.out.println("------------- Estado Atual Conta 1 -----------------");
        System.out.println("STATUS.........: " + conta1.getStatus());
        System.out.println("Número da Conta: " + conta1.getNumeroDaConta());
        System.out.println("Tipo de Conta..: " + conta1.getTipo());
        System.out.println("Saldo..........: " + conta1.getSaldo());
        
        System.out.println("------------- Estado Atual Conta 2 -----------------");
        System.out.println("STATUS.........: " + conta2.getStatus());
        System.out.println("Número da Conta: " + conta2.getNumeroDaConta());
        System.out.println("Tipo de Conta..: " + conta2.getTipo());
        System.out.println("Saldo..........: " + conta2.getSaldo());
        System.out.println("----------------------------------------------------");
    }
}

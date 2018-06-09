
package aula05;

/**
 * Exemplo prático
 * @author Pedro
 */
public class ExecutarContaBanco {
    
    public static void main(String[] args) {
        
        ContaBanco conta = new ContaBanco();
        System.out.println("STATUS.........: " + conta.getStatus());
        System.out.println("Saldo..........: " + conta.getSaldo()+"\n");
        conta.numeroDaConta = 91034;
        conta.tipo = "CC";
        conta.setDono("Jubileu");
        conta.abrirConta();
        
        System.out.println("STATUS.........: " + conta.getStatus());
        System.out.println("Número da Conta: " + conta.getNumeroDaConta());
        System.out.println("Tipo de Conta..: " + conta.getTipo());
        System.out.println("Saldo..........: " + conta.getSaldo());
        
        //Feito os testes com cada uma das Funções para testar seu funcionamento.
//        conta.sacar(50);
//        conta.fecharConta();
//        System.out.println("STATUS.........: " + conta.getStatus());
//        System.out.println("Saldo..........: " + conta.getSaldo());
//        
//        conta.abrirConta();
//        conta.depositar(50);
//        conta.sacar(25);
//        conta.pagarMensalidade();
//        conta.sacar(100);
//        
//        System.out.println("STATUS.........: " + conta.getStatus());
//        System.out.println("Saldo..........: " + conta.getSaldo());
    }
}

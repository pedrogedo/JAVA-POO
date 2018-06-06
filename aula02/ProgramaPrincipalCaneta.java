package aula02;
/**
 * Criando Classes e Objetos em Java.
 * @author Pedro
 */
public class ProgramaPrincipalCaneta {

    public static void main(String[] args) {
        //Instanciando a classe Caneta, objeto c1
        Caneta c1 = new Caneta();
        c1.marca = "BIC";
        c1.cor = "Azul";
        c1.modelo = "RX4758";
        c1.ponta = 0.5f;
        c1.carga = 50;
        c1.tampar();
        c1.status();
        c1.rabiscar();
        
        //Instanciando a classe Caneta, objeto c2
        Caneta c2 = new Caneta();
        c2.marca = "COMPACTOR";
        c2.cor = "Preta";
        c2.modelo = "Tec-01245";
        c2.ponta = 1.0f;
        c2.carga = 90;
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
    
}

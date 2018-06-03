package aula03;
/**
 * Configurando Visibilidade de Atributos e Métodos
 * @author Pedro
 */
public class ProgramaPrincipalCaneta2 {

    public static void main(String[] args) {
        //Instanciando a classe Caneta2, objeto c1
        Caneta2 c1 = new Caneta2();
        c1.cor = "Azul";
        c1.modelo = "RX4758";
        c1.ponta = 0.5f;
        c1.carga = 50;
        c1.tampar();
        c1.status();
        c1.rabiscar(); 
        //c1.tampada; não daria certo pois este atributo é privado.
        
        
        //Instanciando a classe Caneta2, objeto c1
        Caneta2 c2 = new Caneta2();
        c2.cor = "Preta";
        c2.modelo = "Tec-01245";
        c2.ponta = 1.0f;
        c2.carga = 90;
        c2.destampar();
        c2.status();
        c2.rabiscar();
        
        /*Utilizamos os métodos publicos tampar() e destampar(), para alterar
        o estado de tampada. Como esses são da mesma classe que tampada, podem
        alterá-la sem que ocorra nenhum erro. Por serém publicas, podemos fazer
        uso desses métodos em outras classes.*/
    }
    
}

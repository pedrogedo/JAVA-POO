package aula02;
/**
 * Criando Classes e Objetos em Java.
 * @author Pedro
 */
public class Caneta {
    String marca;
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Uma caneta: "+ this.cor);
        System.out.println("Está tampada: "+ this.tampada);
        System.out.println("Carga: "+this.carga+"%");
        System.out.println("Tamanho da ponta: "+ this.ponta);
    }
    
    void rabiscar(){
        if(this.tampada == true){
            System.out.println("ERRO! Não posso rabiscar");
        }else{
            System.out.println("Estou Rabiscando");
        }
    }
    
    void tampar(){
        this.tampada = true;
    }
    
    void destampar(){
        this.tampada = false;
    }
}

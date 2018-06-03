package aula03;
/**
 * Configurando Visibilidade de Atributos e Métodos
 * @author Pedro
 */
public class Caneta2 {
    public String modelo; //A classe atual e todas as outras classes acessam.
    public String cor;
    protected float ponta; //A classe atual e todas as suas sub-classes acessam.
    protected int carga;
    private boolean tampada; //Somente a classe atual acessa.
    
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

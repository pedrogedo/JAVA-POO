
package aula04;

/**
 * Métodos Getter, Setter e Construtor.
 * @author Pedro
 */
public class Caneta4 {
    //Atributos privados
    private String cor;
    private String modelo;
    private float ponta;
    private boolean tampada;
    
    /**
     * Método construtor deve ter o mesmo nome da classe (Caneta4).
     */
    public Caneta4(String modelo, String cor, float ponta){
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.tampar();
    }
    
    /**
     * Função para acesso ao atibuto modelo da Classe.
     * @return retorna o valor inserido no atributo modelo.
     */
    public String getModelo(){
        return this.modelo;
    }
    
    /**
     * Função para modificar o valor do atributo modelo da Classe.
     * @param m 
     */
    public void setModelo(String m){
        this.modelo = m;
    }
    
    /**
     * Função para acesso ao atibuto modelo da Classe.
     * @return retorna o valor inserido no atributo ponta.
     */
    public float getPonta(){
        return this.ponta;
    }
    
    /**
     * Função para modificar o valor do atributo ponta da Classe.
     * @param p
     */
    public void setPonta(float p){
        this.ponta = p;
    }
    
    /**
     * Função para acesso ao atibuto modelo da Classe.
     * @return retorna o valor inserido no atributo cor.
     */
    public String getCor(){
        return this.cor;
    }
    
    /**
     * Função para modificar o valor do atributo cor da Classe.
     * @param c
     */
    public void setCor(String c){
        this.cor = c;
    }
    
    /**
     * Função para acesso ao atibuto modelo da Classe.
     * @return retorna o valor inserido no atributo tampada.
     */
    public boolean getTampada(){
        return this.tampada;
    }
    
    /**
     * Função para modificar o valor do atributo tampada da Classe.
     * @param t
     */
    public void setTampada(boolean t){
        this.tampada = t;
    }
    
    /**
     * Função para Tampar a Caneta.
     */
    public void tampar(){
        this.tampada = true;
    }
    
    /**
     * Função para Destampar a Caneta.
     */
    public void destampar(){
        this.tampada = false;
    }
    
    //Função para impressão dos dados na Tela.
    public void status(){
        System.out.println("SOBRE A CANETA: ");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Tampada: " + this.getTampada());
    }
}

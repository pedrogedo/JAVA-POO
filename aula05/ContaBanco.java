
package aula05;

/**
 * Exemplo prático
 * @author Pedro
 */
public class ContaBanco {
    
    public Integer numeroDaConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //Método Especial Construtor.    
    public ContaBanco(){
        setStatus(false);
        setSaldo(0);
    }
    
    //Métodos especiais Getters e Setters.
    public Integer getNumeroDaConta(){
        return numeroDaConta;
    }
    
    public void setNumeroDaConta(Integer numero){
        this.numeroDaConta = numero;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public String getDono(){
        return dono;
    }
    
    public void setDono(String dono){
        this.dono = dono;
    }
    
    public float getSaldo(){
        return saldo;
    }
    
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    
    public boolean getStatus(){
        return status;
    }
    
    public void setStatus(boolean status){
        this.status = status;
    }
    
    /**
     * Esse método muda o status da conta para verdadeiro e caso seja CC a conta inicia 
     * com o valor de R$ 50,00, caso seja uma conta CP, inicia com o valor de R$ 150,00.
     */
    public void abrirConta(){
        setStatus(true);
        
        if(getTipo() == "CC"){
            setSaldo(50f);
        }else if(getTipo() == "CP"){
            setSaldo(150f);
        }
    }
    
    /**
     * Esse método verifica se a conta possui saldo positivo ou negativo e caso não tenha
     * nenhum dos dois, somente ai ele fecha a conta, do contrário exibe as mensagem para
     * saldo positivo ou negativo.
     */
    public void fecharConta(){
        
        if(getSaldo()>0){
            System.out.println("Você precisa sacar todo valor em conta, antes de fechar.");
        }else if(getSaldo()<0){
            System.out.println("Conta com saldo negativo, não foi possível fechar.");
        }else{
            setStatus(false);
        }
    }
    
    /**
     * Esse método verifica se a conta está aberta, caso esteja, deposita o valor desejado.
     * @param valor
     * @return 
     */
    public float depositar(float valor){
        if(getStatus()){
            setSaldo(getSaldo()+ valor);
        }else{
            System.out.println("A conta está fechada");
        }
        return valor;
    }
    
    /**
     * Verifica se a conta está aberta e o saldo é maior do que 0.
     * Verifica se o saldo atual é maior ou igual o valor que deseja sacar, se for menor
     * recebe a mensagem de saldo insuficiente.
     * @param valor
     * @return 
     */
    public float sacar(float valor){
     if (getStatus()&& getSaldo()>0){
         if(getSaldo() >= valor){
            setSaldo(getSaldo() - valor);
         }else{
             System.out.println("Saldo Insuficiente, Não foi possível realizar o saque !");
         }
     }
     return valor;
    }
    
    /**
     * Verifica se o tipo da conta é CC ou CP.
     * Caso seja CC a mensalidade descontada é de R$12,00.
     * Caso seja CP a mensalidade descontada é de R$20,00.
     */
    public void pagarMensalidade(){
        if(getTipo() == "CC"){
            setSaldo(getSaldo()- 12f);
        }else if(getTipo()=="CP"){
            setSaldo(getSaldo()- 20f);
        }
    }    
}

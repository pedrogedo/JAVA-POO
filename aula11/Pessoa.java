package aula11;

/**
 * Herança parte2
 * Navegação pela Herança
 * @author Pedro
 * Criamos abaixo uma classe abstrata que não poderá ser instanciada em nehuma
 * outra classe. Suas sub-classes, apenas poderão herdar seus atributos e métodos.
 */
public abstract class Pessoa {
    
    private String nome;
    private int idade;
    private String sexo;
    
    /**
     * Método que não poderá ser sobrescrito pelas sub-classes.
     * Definimos isso ao dizer que esse é um método final.
     */
    public final void fazerAniversario(){
        setIdade(getIdade() + 1);
    }

    //Métodos Especiais Getters e Setters.
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}

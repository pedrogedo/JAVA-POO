package aula11;

/**
 * Herança parte2
 * Navegação pela Herança
 * @author Pedro
 */
public class Aluno extends Pessoa{
    
    /*Diferente da classe Visitante, a classe aluno é uma Especialização da classe
    Pessoa. A classe Aluno tem tudo que a classe Pessoa tem e tem também atributos e 
    métodos específicos.*/
    private int matricula;
    private String curso;
    
    public double pagarMensalidade(double valor){
        return valor;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}

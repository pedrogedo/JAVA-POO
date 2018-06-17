package aula10;

/**
 * Herança parte 1
 * @author Pedro
 */
public class Funcionario extends Pessoa{
    
    private String setor;
    private boolean trabalhando;
    
    public void mudarTrabalho(){
        if (getTrabalhando()) {
            setTrabalhando(false);
        }
        else if(!getTrabalhando()){
            setTrabalhando(true);
        }
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    
}

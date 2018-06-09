package aula06;

/**
 * Encapsulamento
 * Criamos uma Interface com o nome Controlador que já tem funções void que 
 * quando essa Interface for chamada, serão implementadas na classe que a chamou.
 * @author Pedro
 */
public interface Controlador {
    public abstract void ligar();
    public abstract void desligar();
    public abstract void abrirMenu();
    public abstract void fecharMenu();
    public abstract void aumentarVolume();
    public abstract void abaixarVolume();
    public abstract void ligarMudo();
    public abstract void desligarMudo();
    public abstract void play();
    public abstract void pause();
}

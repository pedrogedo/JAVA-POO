package aula09;

/**
 * Exercício prático POO em Java
 * @author Pedro
 */
interface Publicacao {
    public abstract void abrir();
    public abstract void fechar();
    public abstract void folhear(int p);
    public abstract void avancarPag();
    public abstract void voltarPag();
}

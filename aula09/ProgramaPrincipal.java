package aula09;
/**
 * Exercício prático POO em Java
 * @author Pedro
 */
public class ProgramaPrincipal {
    
    public static void main(String[] args) {
        
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Pedro Henrique",25, 'M');
        p[1] = new Pessoa("Natalia Tamires",26, 'F');
        
        l[0] = new Livro("Programação Java","João da Silva",300,p[0]);
        l[1] = new Livro("Introdução a UML","José Ferreira",280,p[0]);
        l[2] = new Livro("Recursos Humanos","Juliana Vasconselos",385,p[1]);
        
        p[0].fazerAniversario();
        l[0].abrir();
        l[0].folhear(150);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
        
        p[1].fazerAniversario();
        l[2].abrir();
        l[2].fechar();
        l[2].folhear(300);
        System.out.println(l[2].detalhes());
        
    }
}

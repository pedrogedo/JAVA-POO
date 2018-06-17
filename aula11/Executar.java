package aula11;

/**
 * Herança parte2
 * Navegação pela Herança
 * @author Pedro
 */
public class Executar {
    
    public static void main(String[] args) {
        
        Visitante visitante = new Visitante();
        visitante.setNome("José");
        visitante.setIdade(28);
        visitante.setSexo("Masculino");
        visitante.fazerAniversario();
        
        Aluno aluno = new Aluno();
        aluno.setMatricula(4458744);
        aluno.setCurso("Analise de Sistemas");
        aluno.setNome("Ana");
        aluno.setIdade(26);
        aluno.setSexo("Feminino");
        double a = aluno.pagarMensalidade(500.50);
        
        System.out.println("---------- Visitante ------------");
        System.out.println("Nome.: " + visitante.getNome());
        System.out.println("Idade: " + visitante.getIdade());
        System.out.println("Sexo.: " + visitante.getSexo());
        
        System.out.println("------------ Aluno --------------");
        System.out.println("Matricula..: " + aluno.getMatricula());
        System.out.println("Curso......: " + aluno.getCurso());
        System.out.println("Nome.......: " + aluno.getNome());
        System.out.println("Idade......: " + aluno.getIdade());
        System.out.println("Sexo.......: " + aluno.getSexo());
        System.out.println("Mensalidade: " + a);
    }
}

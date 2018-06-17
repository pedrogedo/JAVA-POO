package aula10;

/**
 * Herança parte 1
 * @author Pedro
 */
public class Executar {
    
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("João da Silva");
        pessoa.setIdade(32);
        pessoa.fazerAniv();
        
        /*Os objetos aluno, professor e funcionário herdam os 
        atributos e métodos de sua classe mãe Pessoa*/
        Aluno aluno = new Aluno();
        aluno.setMatricula(5546248);
        aluno.setCurso("Programação Orientada a Objetos");
        aluno.setNome("Bryan de Sá");
        aluno.setIdade(19);
        aluno.setSexo("Masculino");
        aluno.fazerAniv();
        aluno.cancelarMatricula();
        
        Professor professor = new Professor();
        professor.setEspecialidade("Sistema da Informação");
        professor.setSalario(5.000);
        professor.setNome("Maria Joaquina");
        professor.setIdade(57);
        professor.setSexo("Feminino");
        professor.fazerAniv();
        professor.receberAumento(550.75);
        
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Thiago Martins");
        funcionario.setIdade(25);
        funcionario.setSetor("Analista de Suporte");
        funcionario.setSexo("Masculino");
        funcionario.fazerAniv();
        funcionario.mudarTrabalho();
        
        System.out.println("----------------- ALUNO -------------------");
        System.out.println("Matricula do aluno: " + aluno.getMatricula());
        System.out.println("Curso.............: " + aluno.getCurso());
        System.out.println("Nome do aluno.....: " + aluno.getNome());
        System.out.println("Idade do aluno....: " + aluno.getIdade());
        System.out.println("Sexo..............: " + aluno.getSexo());
        
        System.out.println("----------------- PROFESSOR -----------------");
        System.out.println("Especialidade.....: " + professor.getEspecialidade());
        System.out.println("Salário...........: " + professor.getSalario());
        System.out.println("Nome do professor.: " + professor.getNome());
        System.out.println("Idade do professor: " + professor.getIdade());
        System.out.println("Sexo..............: " + professor.getSexo());
        
        System.out.println("---------------- FUNCIONARIO ----------------");
        System.out.println("Nome do funcionário.: " + funcionario.getNome());
        System.out.println("Idade do funcionário: " + funcionario.getIdade());
        System.out.println("Sexo................: " + funcionario.getSexo());
        System.out.println("Setor...............: " + funcionario.getSetor());
        System.out.println("Trabalhando.........: " + funcionario.getTrabalhando());
    }
}

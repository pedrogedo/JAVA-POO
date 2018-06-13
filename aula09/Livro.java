package aula09;

/**
 * Exercício prático POO em Java
 * @author Pedro
 */
public class Livro implements Publicacao{
    
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    //Método Personalizado.
    public String detalhes() {
        return "Livro{" + "\ntitulo = " + titulo 
                        + "\n, autor = " + autor 
                        + "\n, totalPaginas = " + totalPaginas 
                        + "\n, pagAtual = " + pagAtual 
                        + "\n, aberto = " + aberto 
                        + "\n, leitor = " + leitor.getNome()
                        + "\n, leitor = " + leitor.getIdade()
                        + "\n, leitor = " + leitor.getSexo()+"\n"+ '}';
    }
    
    
    //Método Especial Construtor.
    public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {    
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }

    //Métodos Especiais Getters e Setters.
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public float getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    //Métodos da Interface Publicacao.
    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if(this.getAberto()){
            if (p > this.getTotalPaginas()) {
                this.pagAtual = 0;
            }else{
                this.setPagAtual(p);
            }
        }else{
            System.out.println("Não foi possível folhear o livro !");
        }
        
    }

    @Override
    public void avancarPag() {
        if (getAberto()) {
           this.pagAtual ++; 
        }else{
            System.out.println("Não foi possível avançar a página !");
        }
        
    }

    @Override
    public void voltarPag() {
        if (getAberto()) {
           this.pagAtual --; 
        }else{
            System.out.println("Não foi possível voltar a página !");
        }
        
    }
}

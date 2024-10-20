package biblioteca;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Emprestimo {

    private String dataEmprestimo;
    private String dataDevolucao;

    public void emprestarLivro(Livro livro, Usuario usuario){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        this.dataEmprestimo = now.format(formatter);

        System.out.println("**************************************");
        System.out.println("Emprestimo feito pelo: " + usuario.getNome() + ", Matrícula: " + usuario.getMatricula());
        System.out.println("No dia: " + this.dataEmprestimo);
        System.out.println("**************************************");

        livro.emprestar();
    }

    public void devolverLivro(Livro livro){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        this.dataDevolucao = now.format(formatter);

        System.out.println("**************************************");
        System.out.println("Livro devolvido no dia: " + this.dataDevolucao);
        System.out.println("**************************************");

        livro.devolver();
    }
}

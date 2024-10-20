import biblioteca.Emprestimo;
import biblioteca.Livro;
import biblioteca.Usuario;
import vendas.Cliente;
import vendas.Produto;
import vendas.Venda;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Livro pequenoPrincipe = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", true);
        Livro meChamePeloSeuNome = new Livro("Me Chame Pelo Seu Nome", "André Aciman", true);
        Livro aTeoriaDeTudo = new Livro("A Teoria de Tudo", "Jane Hawking", true);

        Usuario stephenHawking = new Usuario("Stephen Hawking", 1);

        pequenoPrincipe.exibirInformacoes();
        meChamePeloSeuNome.exibirInformacoes();
        aTeoriaDeTudo.exibirInformacoes();

        Emprestimo stephenLePequenoPrincipe = new Emprestimo();

        stephenLePequenoPrincipe.emprestarLivro(pequenoPrincipe, stephenHawking);
        pequenoPrincipe.exibirInformacoes();
        stephenLePequenoPrincipe.devolverLivro(pequenoPrincipe);
        pequenoPrincipe.exibirInformacoes();

        String cpfDamiana = "123.123.123-12";
        String cpfRegex = "^[A-Z0-9]{3}.[A-Z0-9]{3}.[A-Z0-9]{3}-[A-Z0-9]{2}$";
        boolean valido = Pattern.matches(cpfRegex, cpfDamiana);
        System.out.println("CPF Válido? " + valido);

        Cliente damiana = new Cliente("Damiana", cpfDamiana);
        Produto javaTheCompleteReference = new Produto("Java: The Complete Reference", 100.00);

        Venda compraJavaTheCompleteReference = new Venda();
        compraJavaTheCompleteReference.realizarVenda(javaTheCompleteReference, damiana, 5);
    }
}
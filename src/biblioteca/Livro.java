package biblioteca;

import java.sql.SQLOutput;

public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(String titulo, String autor, boolean disponivel){
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;
    }

    public void emprestar(){
        this.disponivel = false;
    }

    public void devolver(){
        this.disponivel = true;
    }

    public void exibirInformacoes(){
        System.out.println("**************************************");
        System.out.println("Livro: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Disponível: " + this.disponivel);
        System.out.println("**************************************");
    }
}

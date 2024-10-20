package biblioteca;

public class Usuario {

    private String nome;
    private int matricula;

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public Usuario(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
    }


}

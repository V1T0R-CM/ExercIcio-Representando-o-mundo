import java.util.ArrayList;

public class Disciplina {
    private String nome;
    ArrayList<Topico> topicos;

    public String getNome(){
        return this.nome;
    }

    public ArrayList<Topico> getTopicos(){
        return this.topicos;
    }

    public void setTopicos(ArrayList<Topico> topicos){
        this.topicos = topicos;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}

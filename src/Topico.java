public class Topico {
    private String nome;
    private int quantaulas;

    public Topico (String nome, int quantaulas){
        this.nome = nome;
        this.quantaulas= quantaulas;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getQuantaulas(){
        return this.quantaulas;
    }

    public void setQuantaulas(int quantaulas){
        this.quantaulas = quantaulas;
    }
}

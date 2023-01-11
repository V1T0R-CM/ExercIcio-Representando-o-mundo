import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Disciplina disciplina = new Disciplina();
        ArrayList<Topico> topicos = new ArrayList<Topico>();

        disciplina.setNome("Calculo1");
        Topico topico1= new Topico("Limites", 2);
        Topico topico2= new Topico("Derivadas", 4);
        Topico topico3= new Topico("Integrais", 6);

        topicos.add(topico1);
        topicos.add(topico2);
        topicos.add(topico3);

        disciplina.setTopicos(topicos);

        System.out.println(disciplina.getNome());
        System.out.println(disciplina.topicos.get(0).getNome());
        System.out.println(disciplina.topicos.get(0).getQuantaulas());
        System.out.println(disciplina.topicos.get(1).getNome());
        System.out.println(disciplina.topicos.get(1).getQuantaulas());
        System.out.println(disciplina.topicos.get(2).getNome());
        System.out.println(disciplina.topicos.get(2).getQuantaulas());

    }

}

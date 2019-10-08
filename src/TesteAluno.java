import java.util.ArrayList;
import java.util.List;

public class TesteAluno {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("victor", 153209);
        Aluno aluno2 = new Aluno("moacir", 153210);
        Aluno aluno3 = new Aluno("ewandro", 153212);
        Aluno aluno4 = new Aluno("tânia", 153215);

        List<Aluno> listaDeAlunos = new ArrayList<>();
        listaDeAlunos.add(aluno1);
        listaDeAlunos.add(aluno2);
        listaDeAlunos.add(aluno3);
        listaDeAlunos.add(aluno4);

        Aluno aluno5 = new Aluno("pedro", 153209);

        if (listaDeAlunos.contains(aluno5)){ // contains necessita do equals na classe
            System.out.println("O " + aluno5.getNomeAluno() + " está na lista");
        } else {
            System.out.println("O " + aluno5.getNomeAluno() + " não está na lista");
        }







    }

}

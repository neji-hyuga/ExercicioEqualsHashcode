import java.util.ArrayList;
import java.util.List;

public class TesteFuncionario {

    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("ana", 15);
        Funcionario funcionario2 = new Funcionario("rose", 16);
        Funcionario funcionario3 = new Funcionario("tati", 17);
        Funcionario funcionario4 = new Funcionario("dani", 18);

        List<Funcionario> listaFuncionario = new ArrayList<>();
        listaFuncionario.add(funcionario1);
        listaFuncionario.add(funcionario2);
        listaFuncionario.add(funcionario3);
        listaFuncionario.add(funcionario4);

        Funcionario funcionario5 = new Funcionario("jaque", 15);

        if (listaFuncionario.contains(funcionario5)){
            System.out.println("A funcionaria " + funcionario5.getNomeFuncionario() + " está na lista");
        } else {
            System.out.println("A funcionaria " + funcionario5.getNomeFuncionario() + " não está na lista");
        }


    }
}

import java.util.Objects;

public class Funcionario {

    private String nomeFuncionario;
    private Integer numeroFuncionario;

    // CONSTRUTOR
    public Funcionario(String nomeFuncionario, Integer numeroFuncionario){
        this.nomeFuncionario = nomeFuncionario;
        this.numeroFuncionario = numeroFuncionario;
    }

    public boolean equals(Object funcionario){
        if (this == funcionario){
            return true;
        }
        if (funcionario == null){
            return false;
        }
        if (funcionario.getClass() != this.getClass()){
            return false;
        }

        Funcionario func = (Funcionario) funcionario;
        return //Objects.equals(this.nomeFuncionario, func.nomeFuncionario)&&
                Objects.equals(this.numeroFuncionario, func.numeroFuncionario);

    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public Integer getNumeroFuncionario() {
        return numeroFuncionario;
    }

    public void setNumeroFuncionario(Integer numeroFuncionario) {
        this.numeroFuncionario = numeroFuncionario;
    }
}

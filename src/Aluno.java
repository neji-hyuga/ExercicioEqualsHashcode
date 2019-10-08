import java.util.Objects;

public class Aluno {

    private String nomeAluno;
    private Integer numeroAluno;



    @Override
    public boolean equals(Object aluno){
        if(this == aluno){
            return true;
        }
        if (aluno == null){
            return false;
        }

        if (aluno.getClass() != this.getClass()){
            return false;
        }

        Aluno alun = (Aluno) aluno;
        return //Objects.equals(this.nomeAluno, alun.nomeAluno)&&
                Objects.equals(this.numeroAluno, alun.numeroAluno);

    }




    public Aluno (String nomeAluno, Integer numeroAluno){
        this.nomeAluno = nomeAluno;
        this.numeroAluno = numeroAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public Integer getNumeroAluno() {
        return numeroAluno;
    }

    public void setNumeroAluno(Integer numeroAluno) {
        this.numeroAluno = numeroAluno;
    }
}

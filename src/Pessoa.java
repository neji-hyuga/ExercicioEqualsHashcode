import java.util.Objects;

public class Pessoa {

    private String nome;
    private Integer rg;

    @Override
    public boolean equals (Object pessoa){
        if(this==pessoa){
            return true;
        }
        if (pessoa == null){
            return false;
        }
        if (pessoa.getClass() != this.getClass()){
            return false;
        }

        Pessoa pess = (Pessoa) pessoa;
        // return Objects.equals(this.nome, pess.nome); são pessoas diferentes
        return Objects.equals(this.rg, pess.rg); // mesma pessoa


    }

    public Pessoa (String nome, Integer rg){
        this.nome = nome;
        this.rg= rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getRg() {
        return rg;
    }

    public void setRg(Integer rg) {
        this.rg = rg;
    }
}

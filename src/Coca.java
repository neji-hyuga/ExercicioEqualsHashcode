import java.util.Objects;

public class Coca {

    private Integer tamanho;
    private Double preco;

    public Coca (Integer tamanho, Double preco){
        this.tamanho = tamanho;
        this.preco = preco;
    }

    @Override
    public boolean equals(Object coca){
        if (this==coca){
            return true;
        }
        if (coca == null){
            return false;
        }
        if (coca.getClass() != this.getClass()){
            return false;
        }

        Coca cocacola = (Coca) coca;
        return Objects.equals(this.tamanho, cocacola.tamanho) &&
        Objects.equals(this.preco, cocacola.preco);

    }

    public Integer getTamanho() {
        return tamanho;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}

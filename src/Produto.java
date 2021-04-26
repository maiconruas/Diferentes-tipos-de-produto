import java.util.Objects;

public class Produto {
    private String nome;
    private int codigo;
    private float preco;

    public Produto(String nome, int codigo, float preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }


    //metodo hashCode
    @Override
    public int hashCode() {
        final int prime = 31;
        int resultado = 1;
        resultado = prime * resultado + codigo;
        return resultado;
    }

    //método equals()
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Produto))
            return false;
        Produto outroProduto = (Produto) object;

        // compara os hashCode
        if (this.hashCode() == outroProduto.hashCode())
            return true;
        else return false;
    }
}

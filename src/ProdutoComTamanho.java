import java.util.Objects;

public class ProdutoComTamanho extends Produto{

    public int tamanho;

    public ProdutoComTamanho(String nome, int codigo, float preco, int tamanho) {
        super(nome, codigo, preco);
        this.tamanho = tamanho;
    }

    //metodo hashCode
    @Override
    public int hashCode() {
        final int prime = 31;
        int resultado = super.hashCode();
        resultado = prime * resultado  + tamanho;
        return resultado;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof ProdutoComTamanho))
            return false;
        ProdutoComTamanho outroProduto = (ProdutoComTamanho) object;

        // compara os hashCode
        if (this.hashCode() == outroProduto.hashCode())
            return true;
        else return false;
    }


}

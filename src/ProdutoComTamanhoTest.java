import org.junit.Test;

import static org.junit.Assert.*;

public class ProdutoComTamanhoTest {

    @Test
    public void testeQuantidadeNoCarrinho()
    {
        Produto p = new Produto("Bermuda",50, 15);
        CarrinhoDeCompra c1 = new CarrinhoDeCompra();
        c1.adicionaProduto(p, 3);
        assertEquals(CarrinhoDeCompra.getQuantidadeNoCarrinho(), 6);

    }
}
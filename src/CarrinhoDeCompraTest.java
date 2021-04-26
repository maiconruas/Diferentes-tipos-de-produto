import org.junit.Test;

import static org.junit.Assert.*;
public class CarrinhoDeCompraTest {
    @Test
    public void testeQuantidadeNoCarrinho()
    {
        Produto p = new Produto("Tenis", 4, 15);
        CarrinhoDeCompra c1 = new CarrinhoDeCompra();
        c1.adicionaProduto(p, 3);
        assertEquals(CarrinhoDeCompra.getQuantidadeNoCarrinho(), 3);

    }

}
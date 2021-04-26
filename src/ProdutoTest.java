import org.junit.Test;

import static org.junit.Assert.*;

public class ProdutoTest {
    @Test
    public void testeEquals() {

        Produto p = new Produto("Bermuda", 3, 50);
        Produto p1 = new Produto("camiseta", 3, 29);
        assertEquals(p.equals(p1), p1.equals(p));
    }

    @Test
    public void testeHashCode()
    {
        Produto pt = new Produto("Bermuda", 3, 50);
        Produto pt1 = new Produto("Blusa", 3, 42);
        assertEquals(pt.hashCode(), pt1.hashCode());

    }



}
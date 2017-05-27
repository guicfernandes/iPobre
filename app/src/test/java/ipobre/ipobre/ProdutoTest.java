package ipobre.ipobre;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Guilherme on 27/05/2017.
 */
public class ProdutoTest {

    @Test
    public void checkValorNegativoOuZero() {
        Produto produto = new Produto("nome", -1.0);
        //Assert.assertEquals(-1, produto.PrecoProduto=-1, 0.0);
        Assert.assertTrue("Preço do produto não é válido", produto.validarValorNegativoOuZero());
    }

    @Test
    public void checkSeNomeEhNulo() {
        Produto produto = new Produto("", 10.0);
        //Assert.assertEquals("", produto.Nome="");
        Assert.assertTrue("Nome do produto é nulo", produto.isNameEmpty());
    }

    @Test
    public void checkSeNomeLengthExcedeLimite(){
        Produto produto = new Produto("teste", 10.0);
        Assert.assertTrue("Nome Excede limite de caracteres", produto.isLengthNameExceed());
    }

    @Test
    public void checkSeDescricaoEhNulo(){
        Produto produto = constroiProduto();
        Assert.assertTrue("Descrição é nula", produto.validarDescricaoNula());
    }

    @Test
    public void checkSeDescricaoExcedeLimite() {
        Produto produto = constroiProduto();
        Assert.assertTrue("Descrição excede limite de caracteres", produto.isLengthDescricaoExceeded());
    }

    private Produto constroiProduto(){
        Produto produto = new Produto();
        produto.setDescricao("");
        produto.setNome("teste");
        produto.setPreco(10.0);
        return produto;
    }

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

}
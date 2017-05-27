package ipobre.ipobre;

import org.junit.Test;

import javax.crypto.BadPaddingException;

import ipobre.ipobre.model.Bandeira;
import ipobre.ipobre.model.Cartao;
import ipobre.ipobre.model.CartaoTipo;
import ipobre.ipobre.model.MeioPagamento;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Created by Renato on 27/05/2017.
 */
public class PagamentoCartaoTest {
    MeioPagamento meioPagamento=new MeioPagamento();

    @Test
    public void ehCartao()throws Exception {
        this.preencheMeioPagamentoTeste();
        assertTrue("NÃO É CARTÃO",meioPagamento.isPagamentoCartao());
    }

    @Test
    public void NaoehCartao()throws Exception {
        this.preencheMeioPagamentoTeste();
        assertFalse("É CARTÃO",meioPagamento.isPagamentoCartao());

    }

    @Test
    public void ehVisa()throws Exception {
        this.preencheMeioPagamentoTeste();
           assertEquals("NÃO É VISA",meioPagamento.getCartao().getBandeira().toString(),"Visa");
    }

    @Test
    public void ehMaster()throws Exception {
        this.preencheMeioPagamentoTeste();
        assertEquals("NÃO É MASTER",meioPagamento.getCartao().getBandeira().toString(),"Master");

    }
    @Test
    public void ehCredito()throws Exception {
        this.preencheMeioPagamentoTeste();
        assertEquals("NÃO É CRÉDITO",meioPagamento.getCartao().getCartaoTipo().toString(),"Credito");
    }

    @Test
    public void ehDebito()throws Exception {
        this.preencheMeioPagamentoTeste();
        assertEquals("NÃO É DÉBITO",meioPagamento.getCartao().getCartaoTipo().toString(),"Debito");

    }

    private void preencheMeioPagamentoTeste(){
        this.meioPagamento.setCartao(new Cartao(CartaoTipo.CREDITO,Bandeira.MASTER));
        this.meioPagamento.setPagamentoCartao(true);
    }

}

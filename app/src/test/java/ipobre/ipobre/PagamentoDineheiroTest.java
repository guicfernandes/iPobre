package ipobre.ipobre;

import org.junit.Before;
import org.junit.Test;

import ipobre.ipobre.model.MeioPagamento;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
/**
 * Created by Renato on 27/05/2017.
 */
public class PagamentoDineheiroTest {

    private MeioPagamento meioPagamento = new MeioPagamento();

    //VERIFICA SE O PAGAMENTO É EM DINHEIRO
    @Test
    public void ehDinheiro(){
        assertTrue("não é pagamento em dinheiro",meioPagamento.isPagamentoDinheiro());
    }

    @Test
    public void valorPreenchidoValido()throws Exception {
        assertTrue("ValorPreenchido Invalido",meioPagamento.valorDinheiroPreenchido());
    }

    @Test
    public void NaoehDinheiro()throws Exception {
        assertFalse("é Dinheiro",meioPagamento.isPagamentoDinheiro());
    }

    @Test
    public void valorPreenchidoInvalido()throws Exception {
        assertFalse("Valor Preenchido valido",meioPagamento.valorDinheiroPreenchido());
    }

    @Before
    public void setUp() throws Exception {
        this.meioPagamento.setPagamentoDinheiro(false);
        this.meioPagamento.setValorDinheiro(0.1);
    }

}

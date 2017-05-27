package ipobre.ipobre;

import org.junit.Test;

import ipobre.ipobre.model.MeioPagamento;
import static org.junit.Assert.assertEquals;

/**
/**
 * Created by Renato on 27/05/2017.
 */
public class PagamentoDineheiroTest {

    private MeioPagamento meioPagamento = new MeioPagamento(true,0.1);

    //VERIFICA SE O PAGAMENTO É EM DINHEIRO
    @Test
    public void ehDinheiro()throws Exception {
        assertEquals(true,meioPagamento.isPagamentoDinheiro());
    }

    @Test
    public void valorPreenchidoValido()throws Exception {
        assertEquals(true,meioPagamento.valorDinheiroPreenchido());
    }


}

package ipobre.ipobre.model;

/**
 * Created by Renato on 27/05/2017.
 */
public class MeioPagamento {
    private boolean pagamentoDinheiro;

    public boolean isPagamentoCartao() {
        return pagamentoCartao;
    }

    public void setPagamentoCartao(boolean pagamentoCartao) {
        this.pagamentoCartao = pagamentoCartao;
    }

    private boolean pagamentoCartao;
    private Cartao cartao;
    private Double valorDinheiro;


    public Cartao getCartao() {
        return cartao;
    }

    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }

    public Double getValorDinheiro() {
        return valorDinheiro;
    }

    public void setValorDinheiro(Double valorDinheiro) {
        this.valorDinheiro = valorDinheiro;
    }



    public MeioPagamento(boolean pagamentoDinheiro, Double valorDinheiro) {
        this.pagamentoDinheiro = pagamentoDinheiro;
        this.valorDinheiro = valorDinheiro;
    }

    public boolean isPagamentoDinheiro() {

        return pagamentoDinheiro;
    }


    public void setPagamentoDinheiro(boolean pagamentoDinheiro) {
        this.pagamentoDinheiro = pagamentoDinheiro;
    }

    public boolean valorDinheiroPreenchido(){

            if (this.getValorDinheiro()>0) {
                return true;

        }return false;
    }


    public MeioPagamento() {
    }

}

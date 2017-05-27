package ipobre.ipobre.model;

/**
 * Created by Renato on 27/05/2017.
 */
public class MeioPagamento {
    private boolean pagamentoDinheiro;

    public Double getValorDinheiro() {
        return valorDinheiro;
    }

    public void setValorDinheiro(Double valorDinheiro) {
        this.valorDinheiro = valorDinheiro;
    }

    private Double valorDinheiro;

    public MeioPagamento() {
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
        if (isPagamentoDinheiro()){
            if (this.getValorDinheiro()>0) {
                return true;
            }
        }return false;
    }
}

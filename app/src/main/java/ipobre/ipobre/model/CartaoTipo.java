package ipobre.ipobre.model;

/**
 * Created by Renato on 27/05/2017.
 */
public enum CartaoTipo {
    DEBITO(0,"Debito"),
    CREDITO(1,"Credito");

    private int codigoTipoCartao;
    private String tipoCartao;


    CartaoTipo(int codigoTipoCartao, String tipoCartao) {
        this.codigoTipoCartao=codigoTipoCartao;
        this.tipoCartao=tipoCartao;
    }
    @Override
    public String toString() {
        return tipoCartao;
    }
}

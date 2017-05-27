package ipobre.ipobre.model;

/**
 * Created by Renato on 27/05/2017.
 */
public class Cartao {
    private Bandeira bandeira;
    private CartaoTipo cartaoTipo;

    public Bandeira getBandeira() {
        return bandeira;
    }

    public void setBandeira(Bandeira bandeira) {
        this.bandeira = bandeira;
    }

    public CartaoTipo getCartaoTipo() {
        return cartaoTipo;
    }

    public void setCartaoTipo(CartaoTipo cartaoTipo) {
        this.cartaoTipo = cartaoTipo;
    }

    public Cartao(CartaoTipo cartaoTipo, Bandeira bandeira) {
        this.bandeira = bandeira;
        this.cartaoTipo = cartaoTipo;
    }
}

package ipobre.ipobre.model;

/**
 * Created by Renato on 27/05/2017.
 */
public enum Bandeira {
  VISA(0,"Visa"),
    MASTER(1,"Master");

    private int codigoBandeira;
    private String nomeBandeira;


    Bandeira(int codigoBandeira, String nomeBandeira) {
        this.codigoBandeira=codigoBandeira;
        this.nomeBandeira=nomeBandeira;
    }
    @Override
    public String toString() {
        return nomeBandeira;
    }
}

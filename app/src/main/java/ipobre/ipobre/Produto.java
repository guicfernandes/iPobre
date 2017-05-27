package ipobre.ipobre;

import java.util.List;

/**
 * Created by Guilherme on 27/05/2017.
 */

public class Produto {
    private int id;
    public String Nome;
    private String descricao;
    public double PrecoProduto;
    private String observacao;
    private List<String> ingredientesExtra;


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return PrecoProduto;
    }

    public void setPreco(double preco) {
        this.PrecoProduto = preco;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public Produto(){}

    public Produto (String nome, double precoProduto) {
        this.Nome = nome;
        this.PrecoProduto = precoProduto;
    }

    // métodos referentes a validação de nome
    public boolean isNameEmpty(){
        if (getNome().equals(""))
            return false;
        else return true;
    }

    public boolean isLengthNameExceed() {
        if (getNome().length() > 40)
            return false;
        else return true;
    }

    // métodos referentes a validação de valor
    public boolean validarValorNegativoOuZero(){
        if (getPreco() > 0)
            return true;
        else return false;
    }

    // métodos referentes a validação de descricao
    public boolean validarDescricaoNula(){
        if (getDescricao().equals(""))
            return false;
        else return true;
    }

    public boolean isLengthDescricaoExceeded() {
        if (getDescricao().length() > 250)
            return false;
        else return true;
    }

    //métodos referentes a validação de observação

}

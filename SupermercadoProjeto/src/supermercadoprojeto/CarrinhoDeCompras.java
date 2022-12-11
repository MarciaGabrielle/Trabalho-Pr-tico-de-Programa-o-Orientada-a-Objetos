package supermercadoprojeto;

public class CarrinhoDeCompras {
    private int qtd;
    Produto produto;

    // CONSTRUTOR

    public CarrinhoDeCompras(int qtd, Produto produto) {
        this.qtd = qtd;
        this.produto = produto;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    // METODO QUE FAZ O CALCULO DO PREÇO DO PRODUTO VEZES A QUANTIDADE REQUERIDA
    public float subTotal() {
        float subTotal;
        subTotal = produto.getPrecoProduto() * qtd;
        return subTotal;
    }

}

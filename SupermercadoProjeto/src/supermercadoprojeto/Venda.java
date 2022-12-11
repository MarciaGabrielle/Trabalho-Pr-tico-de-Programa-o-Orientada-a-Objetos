package supermercadoprojeto;

import java.util.ArrayList;
import java.util.Iterator;

public class Venda {
    ArrayList itensVenda;
    Pagamento P;

    // CONSTRUTOR
    public Venda() {
        itensVenda = new ArrayList();
    }

    // METODO QUE CALCULA A SOMA DOS PRODUTOS DO CARRINHO
    public float valorTotal() {
        float total = 0.f;

        Iterator iterator = itensVenda.iterator(); // percorrer a lista
        while (iterator.hasNext()) {
            CarrinhoDeCompras meuItemVenda = (CarrinhoDeCompras) iterator.next();
            total = meuItemVenda.subTotal() + total;
        }
        return total; // retorna o valor final dos produtos para pagar
    }

    public float getTroco() {
        float valor = P.getValorPago(); // recebe o valor do pagamento
        float t = this.valorTotal(); // recebe o valor total da compra
        float troco = valor - t; // faz a subtração do pagamento com a compra
        return troco; // retorna o troco
    }

    public void incluirItemDeVenda(Produto produto, int quant) {
        // instanciar o item de venda passando os parametros
        // incluir o item de venda no arraylist
        CarrinhoDeCompras iv = new CarrinhoDeCompras(quant, produto);
        itensVenda.add(iv);
    }

    public void efetuarPagamento(float valorPago) {
        P = new Pagamento(valorPago);
    }
}

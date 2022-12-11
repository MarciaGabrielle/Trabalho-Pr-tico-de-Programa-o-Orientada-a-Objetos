package supermercadoprojeto;

public class Registradora {
    EstoqueProduto estoque;
    Venda v;
    
    public Registradora() {    
        estoque = new EstoqueProduto();
    }     
    
    public void iniciarVenda(){
        v = new Venda(); //instanciando um objeto venda
                        //vamos guardar esse objeto como atributo
        estoque = new EstoqueProduto();
    }
    
    //mostra o valor total da compra
    public void concluirVenda(){
        System.out.println("Total: R$"+v.valorTotal());
    }
    
    //Adicionar mais produtos 
    public void incluirProduto(int id, int qtd){
        Produto produto = estoque.getEspecificacao(id);
        v.incluirItemDeVenda(produto, qtd);
    }
    
    //efetua o pagamento 
    public void pagamento(float valorPago){
        v.efetuarPagamento(valorPago);
    }
    
    //devolve o valor do troco
    public void getTroco(){
        System.out.println("Troco: R$" + v.getTroco());
    }
    
}

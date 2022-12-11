package supermercadoprojeto;
//MODELANDO PRODUTO
public class Produto {
//ATRIBUTOS
    //NOSSO PRODUTO TEM UM ID, UM NOME E PRECO
    private int idProduto;
    private String nomeProduto;
    private float precoProduto;  
    
//CONSTRUTOR
    //TEM QUE INSTANCIAR OBRIGATORIO O ID, NOME, E PRECO
    public Produto(int idProduto, String nomeProduto, float precoProduto) {
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
    }
//METODOS ESPECIAIS

    Produto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public float getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(float precoProduto) {
        this.precoProduto = precoProduto;
    }

}

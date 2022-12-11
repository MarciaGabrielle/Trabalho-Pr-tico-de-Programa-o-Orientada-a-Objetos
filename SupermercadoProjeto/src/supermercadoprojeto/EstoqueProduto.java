package supermercadoprojeto;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class EstoqueProduto {
    
    HashMap<Integer, Produto > hashProduto;
    
    public EstoqueProduto(){
        
        hashProduto = new HashMap();
        Produto espec1 = new Produto(5432,"Biscoito Mabel", 1.99f);
        Produto espec2 = new Produto(5433,"Café Tres Corações", 4.99f);
        Produto espec3 = new Produto(5434,"Nissin Miojo", 1.99f);
        Produto espec4 = new Produto(5435,"Fanta Laranja", 5.99f);
        Produto espec5 = new Produto(5436,"Caixa de Chocolate Garoto", 7.50f);
        hashProduto.put(5432, espec1);
        hashProduto.put(5433, espec2);
        hashProduto.put(5434, espec3);
        hashProduto.put(5435, espec4);
        hashProduto.put(5436, espec5);
    }   
    
        //retorna o Id do objeto(produto)criado
    public Produto getEspecificacao(int id){
        
          return this.hashProduto.get(id);
    }
    
       
}

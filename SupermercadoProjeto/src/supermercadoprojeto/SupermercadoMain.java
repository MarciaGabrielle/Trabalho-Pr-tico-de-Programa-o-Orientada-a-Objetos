package supermercadoprojeto;

/**
 *
 * @author Marcia .....
 */
public class SupermercadoMain {
    import java.util.ArrayList;
    import java.util.List;
    import java.util.Scanner;
    
    public static void main(String[] args) {
        private static Scanner in = new Scanner(System.in);
    
        private static List<String> senhas = new ArrayList<String>()
        {{ add("1111"); }}; 
    
    public static void main(String[] args) {
        
        OperadorDeCaixa operador = new OperadorDeCaixa("Gaby", "Gaaby27", "1111" );
        
        auxilioPrint.ImprimaMensagem("\t\tBem vindo ao Sistema do Supermercado");
        auxilioPrint.Continuar();
        
        Registradora reg = new Registradora();
        Boolean sairMenu = false;
        Boolean sairMenuPrincipal = false;
        
        do{
            Scanner in = new Scanner(System.in);
            int chances = 3;
            int tentativas = 0;
            auxilioPrint.ImprimaMensagem("\t\t\t\tACESSO");
            
            System.out.println(" [ 1 ] Iniciar a venda\n [ 0 ] Sair do sistema");
            int opcao1 = in.nextInt();
            
            switch(opcao1) {
                case 1: //iniciar a venda
                    operador.login(operador, tentativas, chances);
                    reg.iniciarVenda();
                          
                    do{
                        auxilioPrint.ImprimaMensagem("\t\t\tPassando Produtos");
                        System.out.println("Codigo dos Produtos:\n5432 - Biscoito Mabel\n5433 - Nissin Miojo\n5434 - Café Tres Coraçoes\n5435 - Fanta Laranja\n5436 - Caixa deChocolate Garoto\n");
                        System.out.println(" [ 1 ] Incluir Produtos\n [ 2 ] Finalizar venda\n [ 0 ] Voltar");
                        int opcao2 = in.nextInt();
                        
                        switch(opcao2){
                                case 1:
                                    System.out.print("\nDigite o codigo de barras: ");
                                    int id = in.nextInt();
                                    System.out.print("Digite a quantidade: ");
                                    int qtd = in.nextInt();
                                    reg.incluirProduto(id, qtd);
                                    break;
                                case 2:
                                    reg.concluirVenda();  
                                    System.out.print("Digite o valor pago: R$");
                                    float valorPago = in.nextFloat();
                                    reg.pagamento(valorPago);
                                    reg.getTroco();
                                    break;
                                case 0:
                                    sairMenuPrincipal = true;
                                    break;
                                default:
                                    break;
                        }
                    }  while(!sairMenuPrincipal);
                    
                    in.nextLine();
                    break;
                    
                case 0: 
                    sairMenu = true;
                    break;
            }
        } while(!sairMenu); 
    }   
    }
    
}

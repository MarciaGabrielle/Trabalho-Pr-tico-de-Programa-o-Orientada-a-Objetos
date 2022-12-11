package projetosupermercado;

import java.util.Scanner;
//Operador de Caixa é classe filha de Funcionario
public class OperadorDeCaixa extends Funcionario{
    
    public OperadorDeCaixa(String nome, String userName, String senha) {
        super(nome, userName, senha);
    }
    
    //metodo reescrito
    @Override
    public void login(OperadorDeCaixa operador, int tentativas, int chances) {
        Scanner in = new Scanner(System.in);
        auxilioPrint.ImprimaMensagem("*                             LOGIN                             *");
        Boolean acessou = false;
        
        do{
            System.out.print("Senha: ");
            String senha = in.nextLine();
            
            if (operador.getSenha().equals(senha)) {
                acessou = true;
                
                auxilioPrint.ImprimaMensagem("              Bem vindo, " + operador.getNome() + "!              ");
            }
            else{
                System.out.println("Senha incorreta.");
                tentativas++;
            }
        }while(tentativas < chances && !acessou);
        
        if (tentativas >= chances && !acessou) {
            System.out.println("As tentativas de login acabaram.\nSaindo...");
            in.nextLine();
        }
    }
    
}

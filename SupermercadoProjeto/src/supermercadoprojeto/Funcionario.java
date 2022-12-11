package supermercadoprojeto;

public abstract class Funcionario {
    
//ATRIBUTOS---------------------------------------------------------------------
    
    private String nome;
    private String userName;
    private String senha;

//CONSTRUTOR--------------------------------------------------------------------
    
    public Funcionario(String nome, String userName, String senha) {
        this.nome = nome;
        this.userName = userName;
        this.senha = senha;
    }

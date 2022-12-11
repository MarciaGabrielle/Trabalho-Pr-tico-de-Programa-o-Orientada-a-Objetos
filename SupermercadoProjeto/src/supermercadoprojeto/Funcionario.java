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
//METODOS ESPECIAIS-------------------------------------------------------------
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
//METODOS-----------------------------------------------------------------------

    public abstract void login(OperadorDeCaixa operador, int tentativas, int chances);
    
    
}

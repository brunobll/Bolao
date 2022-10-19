public class Apostador {
    private String nome;
    private int idade;
    
    public Apostador(){
        nome = "";
        idade = 0;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){ return nome; }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){ return idade; }
    
}

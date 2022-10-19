public class Selecao {
    private int codSelecao;
    private String nomeTecnico;
    private String nomeSelecao;

    public Selecao(){
        codSelecao = 0;
        nomeTecnico = nomeSelecao = "";
    }

    public void setCod(int codSelecao){
        this.codSelecao = codSelecao;
    }

    public int getCod(){ return codSelecao; }

    public void setNTecnico(String nomeTecnico){
        this.nomeTecnico = nomeTecnico;
    }

    public String getNTecnico(){ return nomeTecnico; }

    public void setNSelecao(String nomeSelecao){
        this.nomeSelecao = nomeSelecao;
    }

    public String getNSelecao(){ return nomeSelecao; }
}


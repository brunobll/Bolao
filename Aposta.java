public class Aposta {
    private int numAposta;
    public int[] dataAposta = new int[4];

    public Aposta(){
        numAposta = 0; 
    }

    public void setNum(int numAposta){
        this.numAposta = numAposta;
    }

    public int getNum(){ return numAposta; }

    public void setData(int[] dataAposta){
        this.dataAposta = dataAposta;
    }

    public int[] getData(){ return dataAposta; } 

}

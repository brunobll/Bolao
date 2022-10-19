public class Jogo {
    private String time1;
    private String time2;

    public Jogo(){
        time1 = time2 = "";
    }

    public void setTimes(String time1, String time2){
        this.time1 = time1;
        this.time2 = time2;
    }

    public String getTime1(){ return time1; }
    
    public String getTime2(){ return time2; }

    public int defineGols1(){ return 0; }

    public int defineGols2() { return 0; }

    public void tempoJogo() {}
}

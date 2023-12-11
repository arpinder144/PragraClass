package dec02.oops;

public class SportsMain {
    public static void main(String[] args) {
        Sports s=new Sports("rules","ICC Worldcup","Trophy");
        s.showGameDetails();
        Cricket c=new Cricket("Cricket");
        c.showCricketDetails();
    }
}

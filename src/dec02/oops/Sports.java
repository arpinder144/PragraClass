package dec02.oops;

public class Sports {
    String rules;
    String championship;
    String prize;

    public Sports() {
    }

    public Sports(String rules, String championship, String prize) {
        this.rules = rules;
        this.championship = championship;
        this.prize = prize;
    }

    public void showGameDetails(){
        System.out.println(rules);
        System.out.println(championship);
        System.out.println(prize);
    }
}


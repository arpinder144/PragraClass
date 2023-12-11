package dec02.oops;

public class Cricket extends Sports{
    String sportName;

    public Cricket(String sportName) {
        this.sportName = sportName;
    }

    public void showCricketDetails(){
        //showGameDetails();
        System.out.println(sportName);
    }


}



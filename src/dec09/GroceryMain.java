package dec09;

class Grocery{
    public void shopping(){
        System.out.println("Welcome for shopping");
    }
    public void collectionPoints(){
        System.out.println("Collect points ");
    }
}
class Costco extends Grocery{
    @Override
    public void shopping() {
        System.out.println("Welcome to Costco");
    }

    @Override
    public void collectionPoints() {
        System.out.println("Collect Costco points");
    }
}
class Walmart extends Grocery{
    @Override
    public void shopping() {
        System.out.println("Welcome to Walmart");
    }

    @Override
    public void collectionPoints() {
        System.out.println("Collect points with walmart");
    }
}
class NoFrills extends Grocery{
    @Override
    public void shopping() {
        System.out.println("Welcome to NoFrills");
    }

    @Override
    public void collectionPoints() {
        System.out.println("Collect points with NoFrills");
    }
}
class Panchvati extends Grocery{
    @Override
    public void shopping() {
        super.shopping();
    }

    @Override
    public void collectionPoints() {
        super.collectionPoints();
    }
}


public class GroceryMain {
    public static void main(String[] args) {
        Grocery grocery=new Grocery();
        grocery.shopping();
        grocery.collectionPoints();

        Panchvati panchvati=new Panchvati();
        panchvati.shopping();
        panchvati.collectionPoints();

        Walmart walmart=new Walmart();
        walmart.shopping();
        walmart.collectionPoints();

    }
}

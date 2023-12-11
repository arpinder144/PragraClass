package dec05;

public class Car {
    String type;
    String color;
    String model;

    public Car(String type, String color, String model) {
        this.type = type;
        this.color = color;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}

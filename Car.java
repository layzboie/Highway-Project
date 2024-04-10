public class Car {
    private int id;
    private double startTime;

    public Car(double currentTime) {
        id = 0;
        startTime = currentTime;
    }

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    @Override
    public String toString() {return Integer.toString(getId());}
}

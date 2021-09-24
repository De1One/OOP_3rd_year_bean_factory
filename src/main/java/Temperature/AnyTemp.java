package Temperature;

public class AnyTemp {
    private double temp;

    public AnyTemp(double temp){
        this.temp = temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getTemp() {
        return temp;
    }

    @Override
    public String toString() {
        return String.valueOf(temp);
    }
}

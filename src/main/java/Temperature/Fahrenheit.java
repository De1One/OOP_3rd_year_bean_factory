package Temperature;

public class Fahrenheit extends AnyTemp{
    public Fahrenheit(double temp) {
        super(temp);
    }

    @Override
    public String toString() {
        return super.toString() + "Fahrenheit";
    }
}

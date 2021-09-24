package Temperature;

public class Celsius extends AnyTemp{
    public Celsius(double temp) {
        super(temp);
    }

    @Override
    public String toString() {
        return super.toString() + "Celsius";
    }
}

package Temperature;

public class Kelvin extends AnyTemp{
    public Kelvin(double temp) {
        super(temp);
    }

    @Override
    public String toString() {
        return super.toString() + "Kelvin";
    }
}

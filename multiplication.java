package Strategy;

public class multiplication implements operator{
    @Override
    public double execute(double a, double b) {
        return a * b;
    }
}

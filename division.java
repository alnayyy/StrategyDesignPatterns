package Strategy;

public class division implements operator{
    @Override
    public double execute(double a, double b) {
        return a / b;
    }
}

public class Calculator {
    private operator operation;
    public void setOperator(operator O) {
        this.operation = O;
    }
    public double result(double a, double b) {
        return this.operation.execute(a, b);
    }
}

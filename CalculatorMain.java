public class CalculatorMain {
    public static void main(String[] args) {
        Calculator program = new Calculator();
        double a = 11;
        double b = 5;
        program.setOperator(new addition());
        System.out.println(a + " + " + b + " = " + program.result(a, b));
        program.setOperator(new subtraction());
        System.out.println(a + " - " + b + " = " + program.result(a, b));
        program.setOperator(new multiplication());
        System.out.println(a + " * " + b + " = " + program.result(a, b));
        program.setOperator(new division());
        System.out.println(a + " / " + b + " = " + program.result(a, b));
    }
}

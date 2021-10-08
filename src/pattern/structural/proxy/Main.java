package pattern.structural.proxy;

public class Main {
    public static void main(String[] args) {
        ICalculator calculator = new CalculatorProxy();

        Double rs = calculator.div(1, 0);
        System.out.println(rs);
        rs = calculator.add(1, Double.MAX_VALUE);
        System.out.println(rs);

    }
}

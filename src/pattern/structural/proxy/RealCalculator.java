package pattern.structural.proxy;

public class RealCalculator implements ICalculator {

    @Override
    public double add(double first, double second) {
        // TODO Auto-generated method stub
        return first + second;
    }

    @Override
    public double div(double first, double second) {
        // TODO Auto-generated method stub
        return first / second;
    }

}

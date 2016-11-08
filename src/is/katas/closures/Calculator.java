package is.katas.closures;

public class Calculator {

    public void print(Operation operation) {
        System.out.println(operation.calculate(5));
    }

    @FunctionalInterface
    public interface Operation {
        public double calculate(double value);
    }

}

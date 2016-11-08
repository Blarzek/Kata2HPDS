package is.katas.closures;

public class Main {

    public static void main (String[] args) {
        new Main().start();
    }

    private void start() {
        new Calculator().print(this::calc);
    }

    double calc(double value) {
        return value * 2;
    }

}

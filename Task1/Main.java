package Lambda.Task1;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1); // переменная b будет равна 0
        int c = calc.divide.apply(a, b); // деление на ноль, будет ArithmeticException

       // int d = calc.isPositive.test(b) ? calc.divide.apply(a, b): 0;

        calc.println.accept(c);
    }
}

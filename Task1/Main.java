package Lambda.Task1;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1); // переменная b будет равна 0
        int c = calc.divide.apply(a, b); // деление на ноль, будет ArithmeticException.
                                        // Добавить проверку делителя на ноль в теле лямбда-выражения
                                        // переменной divide класса Calculator, если делитель равен нулю,
                                        // то результат деления будет равен нулю. Или проверять на исключения и
                                        // выводить сообщение о запрете деления на ноль.

       // int d = calc.isPositive.test(b) ? calc.divide.apply(a, b): 0;

        calc.println.accept(c);
    }
}

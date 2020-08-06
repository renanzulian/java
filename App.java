public class App{
    static int limitFibonnaci = 10000;
    public static void main(String[] args) {
        App.fibonacci(0, 1);
    }

    public static void fibonacci(int previousValue, int currentValue) {
        System.out.println(currentValue);
        int nextValue = previousValue + currentValue;
        previousValue = currentValue;
        if (nextValue < App.limitFibonnaci) {
            App.fibonacci(currentValue, nextValue);
        }
    }
}
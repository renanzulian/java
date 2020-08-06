public class App{
    int limitFibonnaci = 10000;
    public static void main(String[] args) {
        int previous = 0;
        int current = 1;
        int next = previous + current;
        int limit = Integer.parseInt(args[0]);

        System.out.println("--FIBONNACI CHALLENGE--");
        do {
            System.out.println(previous);
            previous = current;
            current = next;
            next = previous + current;
        } while (current < limit);
        System.out.println("--FINISHED--");

    }
}
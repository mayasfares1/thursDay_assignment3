// Task 4e
public class Main {

    public static void main(String[] args) {


        fibonacci(1, 1);


    }

    public static void fibonacci(int a, int b) {

        System.out.println(a + "/t" + b);

        if (a + b < 10000) {

            int sum = a + b;

            fibonacci(b, sum);
        }
    }
}
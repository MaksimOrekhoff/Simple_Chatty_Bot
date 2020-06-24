import java.util.Scanner;

class Factorial {

    public static long factorial(long n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;

            }
        return factorial;
        }
        ;
        // write your code here


    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }
}
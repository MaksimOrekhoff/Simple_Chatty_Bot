import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int nextNumber = scanner.nextInt();
        while (nextNumber != 0) {
            sum += nextNumber;
            if (sum >= 1000) {
                sum = sum - 1000;
                break;
            } else {
                nextNumber = scanner.nextInt();
            }
        }
        System.out.println(sum);
        // put your code here
    }
}
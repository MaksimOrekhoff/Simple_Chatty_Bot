import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int nextNumber;
        do {
            nextNumber = scanner.nextInt();
            sum += nextNumber;
        }
        while (nextNumber != 0);
        System.out.println(sum);

        // put your code here
    }
}
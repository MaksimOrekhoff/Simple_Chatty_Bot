import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nextNumber;
        do {
            nextNumber = scanner.nextInt();
            if (nextNumber == 0) {
                break;
            }
            if (nextNumber % 2 != 0) {
                System.out.println("odd");
            } else {
                System.out.println("even");
            }

        }
        while (nextNumber != 0);
        // put your code here
    }
}
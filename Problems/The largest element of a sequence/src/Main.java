import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxNumber = 0;
        int nextNumber;

        do {
            nextNumber = scanner.nextInt();

            if (nextNumber > maxNumber) {
                maxNumber = nextNumber;
            }
        }
        while (nextNumber != 0);

        System.out.println(maxNumber);

        // put your code here
    }
}
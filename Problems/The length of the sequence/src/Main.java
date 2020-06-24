import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantity = 0;

        while (scanner.hasNext()) {
            int nextNumber = scanner.nextInt();
            if (nextNumber > 0) {
                quantity++;
            } else {
                System.out.println(quantity);
            }
        }

        // put your code here
    }
}
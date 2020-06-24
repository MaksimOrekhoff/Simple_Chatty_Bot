import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int operand = 1;


        do {
            if (operand * operand <= n)
                System.out.println(operand * operand);
            operand++;
        }
        while (operand * operand <= n);

        // put your code here
    }
}

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int newnum = 0;
        for (int i = 1; i <= n; i++) {
            newnum = scanner.nextInt();
            if (newnum % 6 == 0) {
                sum += newnum;
            }
        }
        System.out.print(sum);
        // put your code here
    }
}

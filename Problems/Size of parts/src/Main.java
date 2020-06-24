import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int large = 0;
        int perfect = 0;
        int small = 0;
        int detector = 0;
        for (int i=0; i<n; i++) {
            detector = scanner.nextInt();
            if (detector == 0) {
                perfect++;
            } else if (detector == -1) {
                small++;
            } else if (detector == 1) {
                large++;
            }
        }
        System.out.println(perfect + " " + large + " " + small);
        // put your code here
    }
}
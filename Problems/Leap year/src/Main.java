import java.util.Scanner;

class Leapyear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year >= 1900 && year <= 3000) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println("Leap");
            } else {
                System.out.println("Regular");
            }
        } else {
            System.out.println("Regular");
        }


        // put your code here
    }
}

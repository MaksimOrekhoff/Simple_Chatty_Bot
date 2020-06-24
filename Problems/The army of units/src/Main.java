import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int units = sc.nextInt();

        if (units < 1) {
            System.out.println("no army");
        } else if (units >= 1 && 19 >= units ) {
            System.out.println("pack");
        } else if (units >= 20 && units <= 249) {
            System.out.println("throng");
        } else if (units >= 250 && units <= 999) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
        // put your code here
    }
}
import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        long factorial=1;
        int i =1;
        do {
            i++;
            factorial*=i;
        }
        while (m >= factorial);
        System.out.println(i);
        // put your code here
    }
}
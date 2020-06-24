import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //int divideByFour = 0;
        int divideByFourMax = 0;
        for (int i = 0; i<n; i++) {
            int nextNumber = scanner.nextInt();
            if (nextNumber%4==0) {
                //divideByFourMax = (nextNumber > divideByFourMax) ? nextNumber : divideByFourMax;
                if (nextNumber > divideByFourMax) {
                    divideByFourMax = nextNumber;
                }
            }
        }
        System.out.println(divideByFourMax);
        // put your code here
    }
}
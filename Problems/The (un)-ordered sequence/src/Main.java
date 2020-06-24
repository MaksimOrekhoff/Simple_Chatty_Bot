import java.util.Scanner;

class Sequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nextNumber = scanner.nextInt();
        int currentNumber = nextNumber;
        boolean ascending = false;
        boolean descending = false;
        int count = (currentNumber != 0) ? 1 : 0;
        while (nextNumber != 0) {
            nextNumber = scanner.nextInt();

            if (nextNumber == 0) {
                break;
            }
            count++;

            if (nextNumber > currentNumber) {
                if (!descending) {
                    currentNumber = nextNumber;
                    ascending = true;
                } else {
                    ascending = descending = false;
                    break;
                }
            } else if (nextNumber < currentNumber) {
                if (!ascending) {
                    descending = true;
                    currentNumber = nextNumber;
                } else {
                    ascending = descending = false;
                    break;
                }
            } else {
                currentNumber = nextNumber;
            }
        }
        if (count == 1) {
            System.out.println(true);
        } else if (count > 1) {
            System.out.println(ascending || descending);
        } else {
            System.out.println(false);
        }

    }
    // put your code here
}
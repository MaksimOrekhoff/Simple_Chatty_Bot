import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = scanner.nextInt();
        double percent = scanner.nextInt();
        double endMoney = scanner.nextInt();
        int year = 0;
        do {
            for (int i = 0; endMoney > money; i++) {
                money = money + money * percent/100;
                year++;
            }
        }
        while (endMoney > money);
        System.out.println(year);

        // write your code here
    }
}
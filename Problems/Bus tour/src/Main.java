import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int heigtBus = scanner.nextInt();
        int numberOfBridges = scanner.nextInt();
        int bridge = 0;
        int nextBridge;
        for (int i = 1; i <= numberOfBridges; i++) {
            nextBridge = scanner.nextInt();
            if (heigtBus >= nextBridge) {
                bridge = i;
                break;
            }
        }
        if (bridge == 0) {
            System.out.println("Will not crash");
        } else {
            System.out.println("Will crash on bridge " + (bridge));
        }
    }
}
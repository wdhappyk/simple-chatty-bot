import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int bridges = scanner.nextInt();
        boolean crash = false;

        for (int i = 1; i <= bridges; ++i) {
            int bridgeHeight = scanner.nextInt();
            if (height >= bridgeHeight) {
                crash = true;
                System.out.print("Will crash on bridge " + i);
                break;
            }
        }

        if (!crash) {
            System.out.print("Will not crash");
        }
    }
}
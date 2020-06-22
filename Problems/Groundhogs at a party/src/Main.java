import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cups = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();
        boolean isOvereat = isWeekend && cups >= 15 && cups <= 25 || !isWeekend && cups >= 10 && cups <= 20;

        System.out.print(isOvereat);
    }
}
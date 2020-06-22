import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year % 4 == 0 && (year % 400 == 0 || year % 100 != 0)) {
            System.out.print("Leap");
        } else {
            System.out.print("Regular");
        }
    }
}
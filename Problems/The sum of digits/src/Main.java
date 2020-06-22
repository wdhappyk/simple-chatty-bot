import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i1 = n / 100;
        int i2 = n % 100 / 10;
        int i3 = n % 100 % 10;
        int sum = i1 + i2 + i3;
        System.out.print(sum);
    }
}
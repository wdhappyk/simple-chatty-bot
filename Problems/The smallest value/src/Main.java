import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        long n = 1;
        int x = 1;

        while (n <= m) {
            x++;
            n *= x;
        }

        System.out.print(x);
    }
}
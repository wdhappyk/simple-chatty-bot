import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < n; ++i) {
            int m = scanner.nextInt();
            if (m % 6 == 0) {
                sum += m;
            }
        }

        System.out.print(sum);
    }
}
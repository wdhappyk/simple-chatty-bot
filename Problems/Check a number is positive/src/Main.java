import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n > 0) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
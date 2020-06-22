import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;

        for (int i = 0; i < n; ++i) {
            int m = scanner.nextInt();
            if (m == 2) countD++;
            else if (m == 3) countC++;
            else if (m == 4) countB++;
            else if (m == 5) countA++;
        }

        System.out.print(countD + " " + countC + " " + countB + " " + countA);
    }
}
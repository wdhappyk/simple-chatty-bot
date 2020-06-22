import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int from = scanner.nextInt();
        int to = scanner.nextInt();
        int sum = 0;
        int count = 0;

        for (int i = from; i <= to; ++i) {
            if (i % 3 == 0) {
                sum += i;
                count++;
            }
        }

        float avg = (float)sum / (float)count;
        System.out.print(avg);
    }
}
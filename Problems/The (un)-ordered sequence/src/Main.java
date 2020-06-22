import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean ascending = false;
        boolean descending = false;

        int lastNumber = scanner.nextInt();

        while (scanner.hasNext()) {
            int currentNumber = scanner.nextInt();

            if (currentNumber == 0) {
                break;
            }

            if (currentNumber > lastNumber) {
                ascending = true;
            }

            if (currentNumber < lastNumber) {
                descending = true;
            }

            lastNumber = currentNumber;
        }

        System.out.print(ascending ^ descending || !ascending);
    }
}
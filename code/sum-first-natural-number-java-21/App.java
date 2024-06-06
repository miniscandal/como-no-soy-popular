import java.util.Scanner;

public class App {
    public int getInputNumber(Scanner scanner) {
        System.out.print("Enter a natural number: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter an integer: ");
            scanner.next();
        }
        int number = scanner.nextInt();

        System.out.print("\n");

        return number;
    }

    /*
     * Gauss formula method
     */
    public int calculateAdditionWithFormula(int number) {
        System.out.println("Calculating sum using formula...");

        int sum = (number * (number + 1) / 2);

        return sum;
    }

    /*
     * Iterative approach method
     */
    public int calculateAdditionWithIteration(int number) {
        System.out.println("Calculating sum using iteration...");

        int sum = 0;

        for (int i = 0; i < number / 2; i++) {
            sum = sum + (i + 1 + number - i);
        }

        if (number % 2 != 0) {
            sum = sum + number / 2 + 1;
        }

        return sum;
    }

    public static void main(String[] args) {
        var console = System.console();

        if (console == null) {
            System.out.println("No console available.");
            return;
        }

        Scanner scanner = new Scanner(console.reader());

        App app = new App();
        int number = app.getInputNumber(scanner);
        int result = 0;

        result = app.calculateAdditionWithFormula(number);
        System.out.println("Result: " + result);

        System.out.print("\n");

        result = app.calculateAdditionWithIteration(number);
        System.out.println("Result: " + result);

        scanner.close();
    }
}

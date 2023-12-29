import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        do {
            showInterface();
        } while (true);
    }

    private static void showInterface() {
        Opration obj = new Opration();

        System.out.println("\n\t1.Add\n\t2.Subtraction\n\t3.Product\n\t4.Division\n\t5.Exit\n");

        int ch = readInput(0);
        if (ch == 5) {
            System.out.printf("\nExit....\n\n");
            System.exit(0);
        }

        int num1 = readInput(1);
        int num2 = readInput(2);

        switch (ch) {
            case 1 ->
                System.out.printf("\nResult:\t( %d + %d = %d )\n\n", num1, num2, obj.add(num1, num2));

            case 2 ->
                System.out.printf("\nResult:\t( %d - %d = %d )\n\n", num1, num2, obj.subtract(num1, num2));

            case 3 ->
                System.out.printf("\nResult:\t( %d * %d = %d )\n\n", num1, num2, obj.product(num1, num2));

            case 4 ->
                System.out.printf("\nResult:\t( %d / %d = %.2f )\n\n", num1, num2, obj.division(num1, num2));

            default ->
                System.out.printf("\nInvalid Input\n\n");

        }

    }

    private static int readInput(int i) {
        Scanner in = new Scanner(System.in);
        if (i == 0)
            System.out.print("Enter Choice (1/2/3/4/5):");
        else
            System.out.printf("Enter Number %d:", i); 
        return in.nextInt();
    }
}

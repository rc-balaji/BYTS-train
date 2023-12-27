import java.util.Scanner;

class Exp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int cond = in.nextInt();
        switch (cond % 2) {
            case 0 -> System.out.println("Even");
            case 1 -> System.out.println("ODD");
            default -> System.out.println("Default");
        }
    }
}

class ExpS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int cond = in.nextInt();
        switch (cond % 2) {
            case 0 -> System.out.println("Even");
            case 1 -> System.out.println("ODD");
            default -> System.out.println("Default");
        }
    }
}

class Exp1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = in.nextInt();
        System.out.print("Enter Range : ");
        int range = in.nextInt();
        int i = 1;
        System.out.printf("Multipl Table for %d upto %d\n", num, range);
        while (i <= range) {

            System.out.printf("%2d * %2d = %d\n", num, i, num * i);
            i++;

        }
    }
}

class Exp2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Range : ");
        int range = in.nextInt();
        int num = 2;
        int i = 1;
        while (i <= range / 2) {

            if (i % 2 == 0) {

                System.out.println(num);

            }
            num += 2;
            i++;
        }
    }
}

import java.util.Scanner;
class Exp{
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int cond = in.nextInt();
        switch(cond%2){
            case 0 -> System.out.println("Even");
            case 1 -> System.out.println("ODD");
            default -> System.out.println("Default");
        }
    }
}
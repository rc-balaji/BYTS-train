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

class Exp3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int Mark = 0;

        for(int i=0;i<6;i++){
            System.out.printf("Enter Mark %d : ",(i+1));
            Mark+=in.nextInt();
        }

        System.out.printf("Total : %d \nAverage %.2f",Mark,(float)Mark/6);
    }
}


class Exp4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Num1 : ");
        int num1 = in.nextInt();

        System.out.print("Enter Num2 : ");
        int num2 = in.nextInt();   

        if(num1>num2){

            System.out.printf("Max : %d\nMin : %d",num1,num2);

        }else{
             System.out.printf("Max : %d\nMin : %d",num2,num1);

        }

    }
}

class Exp5 {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.print("Enter Celsius : ");
        double Celsius = in.nextDouble();

        double Fahrenheit = (Celsius * 9/5) +32;

        System.out.printf("%.2f Celsius = %.2f Fahrenheit",Celsius,Fahrenheit);
        
    }
}

import java.util.Scanner;

class Exp1{
	public static void main(String args[]){
 		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter Number1 : ");
		float num1 = in.nextFloat();
		System.out.print("Enter Number2 : ");
		float num2 = in.nextFloat();
		System.out.printf("Product of %.2f and %.2f is %.2f",num1,num2,(num1*num2));
		
		
		
		
	}
}

class Exp2{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter base : ");
		float base = in.nextFloat();
		System.out.print("Enter height : ");
		float height = in.nextFloat();
		double area = 0.5*base*height;
		System.out.printf("Area of Triangle is : %.2f ",area);
		
		
	}
}

class Exp3{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter String : ");
		StringBuffer str = new StringBuffer();
		
		str.append(in.nextLine());
		
		System.out.printf("Reversed String : "+str.reverse());
		
	}
}


class Exp4{
	
	public static int reminder(int Numberator,int Denominator){
		if(Numberator<Denominator){
			return Numberator;
		}
		return reminder(Numberator-Denominator,Denominator);
		
	}
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter Numberator : ");
		int numi = in.nextInt();
		
		System.out.print("Enter Denominator : ");
		int Denomi = in.nextInt();
		
		System.out.printf("The Remainder of %d and %d is %d",numi,Denomi,reminder(numi,Denomi));
	}
}

 class Exp5 {
	
	   static int getDifference(int num1, int num2) {
        return num1 - num2;
    }

      static float getDifference(float num1, float num2) {
        return num1 - num2;
    }

      static short getDifference(short num1, short num2) {
        return (short)(num1 - num2);
    }

     static double getDifference(double num1, double num2) {
        return num1 - num2;
    }
    
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Integer Value 1: ");
        int int1 = in.nextInt();
        System.out.print("Enter Integer Value 2: ");
        int int2 = in.nextInt();
        System.out.println("Difference of Integers: " + getDifference(int1, int2));

        System.out.print("Enter Float Value 1: ");
        float float1 = in.nextFloat();
        System.out.print("Enter Float Value 2: ");
        float float2 = in.nextFloat();
        System.out.println("Difference of Floats: " + getDifference(float1, float2));

        System.out.print("Enter Short Value 1: ");
        short short1 = in.nextShort();
        System.out.print("Enter Short Value 2: ");
        short short2 = in.nextShort();
        System.out.println("Difference of Shorts: " + getDifference(short1, short2));

        System.out.print("Enter Double Value 1: ");
        double double1 = in.nextDouble();
        System.out.print("Enter Double Value 2: ");
        double double2 = in.nextDouble();
        System.out.println("Difference of Doubles: " + getDifference(double1, double2));
    }

  
}

class Exp6{
	
	
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter Integer Value : ");
		int IntegerValue = in.nextInt();
		
		in.nextLine();
		
		System.out.print("Enter Name : ");
		String Name = in.nextLine();
		
		System.out.print("Enter City : ");
		String City = in.nextLine();
		
		if(IntegerValue>80){
			System.out.println("Name : "+Name);
			
		}
		else{
			System.out.println("City : "+City);
		
		}
		
		}
}


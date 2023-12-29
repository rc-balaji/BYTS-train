import java.lang.reflect.Array;
import java.util.Arrays;

class Exp {

    public static void main(String[] args) {
        StringBuffer obj = new StringBuffer();

        obj.append("HelloWorld");


        System.out.println("Append:"+obj);
        obj.insert(5, " ");
        System.out.println("Insert:"+obj);

        obj.delete(3, 6);
        System.out.println("Delete:"+obj);

        obj.replace(0,7,"Hello World");
        System.out.println("Replace:"+obj);
        
        obj.reverse();
        System.out.println("reverse:"+obj);
      
        System.out.println("IndexOF:"+obj.indexOf("d"));

        String vowels  = "AaEeIiOoUu";

        String str = "HelloWorld";

        for(int i=0;i<str.length();i++){

            if(vowels.contains(""+str.charAt(i))){
                    System.out.println(str.charAt(i));
            }

        }


        int[] a = {2,4,5,6,10};


        String str1 = Arrays.toString(a);
        for (int i = 0; i < 15; i++) {
            if(!str1.contains(""+i)){
                System.out.println(i);
            }
        }

        


    }
}
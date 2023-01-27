import java.util.Scanner;


class java

{
   public static void main(String[] args) 
{

        String k[]={"25","29","18","98","24","19"};

        String b[]={"25","29","18","98","24","24"};

        int sum;

        int size=k.length;

        System.out.print("Fist Array =   ");

        for (String i : k)  

        {

            System.out.print(" "+i);    

        }

        System.out.println("  ");

        System.out.print("Second Array = ");

        for (String i : b)

        {

            System.out.print(" "+i);    

        }


        System.out.println();

        System.out.println("Sum =");

        for (int i = 0; i <= size; i++)
 {
           sum = Integer.parseInt(k[i]) + Integer.parseInt(b[i]);

            System.out.println(" "+sum);
        }



    }
}
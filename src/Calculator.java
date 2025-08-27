import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, z=0;
        System.out.println("Enter two coordinate");
        x = sc.nextInt();
        y = sc.nextInt();

        try //the block where we know exception can occur
            {
            z = x/y;
            }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        catch(Exception e)
        //one try can have multiple catches and "Exception" is the ultimate one, we need no more exceptions after this,
        // before this is okay, you can add but once this is written no need for any other exceptions
        {
            System.out.println(e.getMessage());
        }

        finally //z print
            {
            System.out.println(z);
            }
    }
}

import java.util.Scanner;
// then press Enter. You can now see whitespace characters in your code.
public class Main
{
    public static void main(String[] args)
    {

      int age = 0;
      Scanner in = new Scanner(System.in);
      System.out.println("Please enter your age: ");
      age = in.nextInt();

      if(age >= 21)
      {
          System.out.println("You are above 21 so you get a wristband!");

      }



    }
}
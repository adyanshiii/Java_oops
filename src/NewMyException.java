import java.util.Scanner;

public class NewMyException {
    public static void main(String args[])
    {
      UserDefException sc = new UserDefException();
      try
      {
          sc.withdraw(5000);
          sc.withdraw(10000000);
      }
      catch (insufficientBalanceException e)
      {
          System.out.println(e.getMessage());
      }
}
}

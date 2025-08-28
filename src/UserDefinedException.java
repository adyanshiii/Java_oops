public class UserDefinedException {
    public void validate(int age) throws InvalidAgeException //more than one exception can be thrown
    {
        if (age<18)
        {
            throw new InvalidAgeException("Not eligible"); //THROW ek baar me ek hi exception ko throw krta hai
        }
        else
            System.out.println("You are eligible");
    }
}

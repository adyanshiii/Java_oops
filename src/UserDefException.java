public class UserDefException { //Use custom exception
    private int Balance=10000;
        public void withdraw(int amount)
        {
            if (amount > Balance)
            {
                throw new insufficientBalanceException("Insufficient Balance"); //THROW ek baar me ek hi exception ko throw krta hai
            }
            else
                Balance-=amount;
                System.out.println("Successful, Remaining Balance: "+Balance);
        }
    }


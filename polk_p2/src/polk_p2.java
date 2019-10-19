public class polk_p2
{
    public static void main(String[] args)
    {
        SavingsAccount saver1, saver2;
        saver1 = new SavingsAccount(2000.00);
        saver2 = new SavingsAccount(3000.00);

        saver1.modifyInterestRate(0.04);
        for(int i = 0; i < 12; i++)
        {
            saver1.calculateMonthlyInterest();
            System.out.printf("Account 1 month %d balance: ", i+1);
            saver1.printBalance();
            saver2.calculateMonthlyInterest();
            System.out.printf("Account 2 month %d balance: ", i+1);
            saver2.printBalance();
            System.out.println();
        }
        saver2.modifyInterestRate(0.05);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.print("Account 1 balance with modified interest rate: ");
        saver1.printBalance();
        System.out.println();
        System.out.print("Account 2 balance with modified interest rate: ");
        saver2.printBalance();
    }

}

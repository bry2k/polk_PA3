public class SavingsAccount
{
    static double annualInterestRate;
    double savingsBalance;
    public SavingsAccount(double bal)
    {
        savingsBalance = bal;
    }
    public double calculateMonthlyInterest()
    {
        savingsBalance += savingsBalance*annualInterestRate/12.0;
        return savingsBalance*annualInterestRate/12.0;
    }
    public static void modifyInterestRate(double newRate)
    {
        annualInterestRate = newRate;
    }

    public void printBalance()
    {
        System.out.printf("%.2f\t", savingsBalance);

    }
}

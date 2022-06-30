public class Account {
    private String id;
    private String name;
    private double balance;


    public Account(String id, String name)
    {
        this.id = id;
        this.name = name;
    }
    public Account(String id, String name, double balance)
    {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId()
    {
        return this.id;
    }

    public String getName()
    {
        return this.name;
    }

    public double getBalance()
    {
        return this.balance;
    }
    public void credit(double amount)
    {
        this.balance +=amount;
    }

    public boolean debit(double amount)
    {
        if(this.balance - amount <= 0)
        {
            System.out.println("Amount exceeded");
            return false;
        }
        else
        {
         this.balance = this.balance - amount;
         return true;
        }
    }
    public void transferTo(Account another, double amount)
    {
        if(this.balance - amount <= 0)
        {
            System.out.println("Amount exceeded");
        }
        else
        {
            another.balance = another.balance + amount;
            this.balance = this.balance - amount;
            System.out.println("Transfer completed");
        }
    }

    public String accountDetails()
    {
        return this.name + " the current balance in your account " + this.id + " is $" + this.balance;
    }
}

class Account {

    public long accNo;
    public String name, phoneno, address, dob;
    public double balance;
    
    
    //Constructor
    public Account(long accNo, String name, String phoneno, String address, String dob, double balance) {
        this.accNo = accNo;
        this.name = name;
        setphone(phoneno);
        this.address = address;
        this.dob = dob;
        this.balance = balance;

    }

    public long getAccNo() {
        return accNo;
    }

    public String getName() {
        return name;
    }

    public String getphoneNo() {
        return phoneno;
    }

    public String getaddress() {
        return address;
    }

    public String getdob() {
        return dob;
    }

    public double getBalance() {
        return balance;
    }

    public void setphone(String num) {
        phoneno = num;
    }

    public String toString() {
        return "Account No:" + accNo + "\nName: " + name + "\nAddress: " + address + "\nPhone No: " + phoneno
                + "\nDOB: " + dob + "\nBalance: " + balance;
    }
}

class SavingAccount extends Account {

    public SavingAccount(long accNo, String name, String phoneno, String address, String dob, double balance) {
        super(accNo, name, phoneno, address, dob, balance);
        // TODO Auto-generated constructor stub
    }

    public double deposit(long amt) {
        return balance += amt;

    }

    public void withdraw(long amt) {
        balance -= amt;
    }

}

class LoanAccount extends Account {

    public LoanAccount(long accNo, String name, String phoneno, String address, String dob, double balance) {
        super(accNo, name, phoneno, address, dob, balance);
        // TODO Auto-generated constructor stub
    }

    public double payEmi(long amt) {
        return balance -= amt;
    }

    public void repay(long amt) {
        if (balance == amt)
            balance = 0;
    }

}

public class inheritanceChallenge {

    public static void main(String[] args) {
        Account account = new Account(712543, "Mr. Chatterbox", "98523641", "Boston", "12/5/1995", 10000);
        SavingAccount savingAccount = new SavingAccount(712543, "Mrs. Chatterbox", "98523641", "Boston", "12/5/1995", 1000);
        savingAccount.deposit(5200);
        LoanAccount loanAccount = new LoanAccount(712544, "Mr. Borrower", "98765432", "New York", "11/3/1990", 500000);
        loanAccount.payEmi(1000);
        loanAccount.repay(500000);

        System.out.println(account.toString());
        System.out.println(savingAccount.toString());
        System.out.println(loanAccount.toString());

    }
}
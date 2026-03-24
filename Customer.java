public class Customer {
    private int accountNumber;
    private String name;
    private double balance;
    private String accountType;
    private String email;

    public Customer(int accountNumber,String name,double balance,String accountType, String email){
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance= balance;
        this.accountType = accountType;
        this.email = email;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public String getName(){
        return this.name;
    }

    public double getBalance(){
        return this.balance;
    }

    public String getAccountType(){
        return this.accountType;
    }

    public String getEmail(){
        return this.email;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setAccountType(String accountType){
        this.accountType = accountType;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String toString(){
        return "Account Number: "+accountNumber+"\nName: "+name+"\nBalance: "+balance+"\nAccount Type: "+accountType+"\nEmail: "+email;
    }

}

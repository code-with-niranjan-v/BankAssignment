import java.util.ArrayList;

class Bank{
    private ArrayList<Customer> customers = new ArrayList<>();

    public void createAccount(int accountNumber,String name,double balance,String accountType, String email){
        customers.add(new Customer(accountNumber, name, balance, accountType, email));
    }

    public void deposit(int accountNumber,double amt){
        for(Customer c:customers){
            if(c.getAccountNumber()==accountNumber){
                c.setBalance(c.getBalance()+amt);
                System.out.println("Deposit Successful!");
                return;
            }
            
        }
        System.out.println("No Customer Found with Account Number "+accountNumber);


    }

    public void withdraw(int accountNumber,double amt){
        for(Customer c:customers){
            if(c.getAccountNumber()==accountNumber){
                if(c.getBalance()>=amt){
                    c.setBalance(c.getBalance()-amt);
                    System.out.println("Withdraw Successful!");
                }else{
                    System.out.println("Insufficient Funds!");
                }
                return;
            }
            
        }
        System.out.println("No Customer Found with Account Number "+accountNumber);

        
    }

    public void enquiryBalance(int accountNumber){
         for(Customer c:customers){
            if(c.getAccountNumber()==accountNumber){
                System.out.println("Account Number: "+accountNumber+"\nBalance: "+c.getBalance());
                break;
            }
            
        }
    }

    public void searchCustomer(int accountNumber){
        for(Customer c:customers){
            if(c.getAccountNumber()==accountNumber){
                System.out.println(c);
                return;
            }
            
        }
        System.out.println("No Customer Found with Account Number "+accountNumber);
    }

    public void displayAllCustomers(){
         for(Customer c:customers){
            System.out.println(c);
        }
    }

}
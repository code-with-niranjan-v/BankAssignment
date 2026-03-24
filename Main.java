import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Bank b1 = new Bank();

        Scanner sc = new Scanner(System.in);

        boolean isEnd = false;
        while(!isEnd){
            System.out.println("1.Create Account\n2.Deposit\n3.Withdraw\n4.Search Customer\n5.Display All Customers\n6.Enquire Balance\n7.Exit\nEnter Option: ");
        int option = Integer.parseInt(sc.nextLine());
        switch(option){
            case 1:{
                System.out.println("Enter Account Number: ");
                int accountNumber = Integer.parseInt(sc.nextLine());
                System.out.println("Enter Name: ");
                String name = sc.nextLine();
                System.out.println("Enter Balance: ");
                double balance = Double.parseDouble(sc.nextLine());
                System.out.println("Enter Account Type: ");
                String accountType = sc.nextLine();
                System.out.println("Enter Email: ");
                String email = sc.nextLine();

                b1.createAccount(accountNumber, name, balance, accountType, email);
                System.out.println("Account Created SuccessFully!");
            }
            break;
            case 2:{
                System.out.println("Enter Account Number: ");
                int accountNumber = Integer.parseInt(sc.nextLine());
                System.out.println("Enter Amount: ");
                double amt = Double.parseDouble(sc.nextLine());
                b1.deposit(accountNumber, amt);
            }
            break;
            case 3:{
                System.out.println("Enter Account Number: ");
                int accountNumber = Integer.parseInt(sc.nextLine());
                System.out.println("Enter Amount: ");
                double amt = Double.parseDouble(sc.nextLine());
                b1.withdraw(accountNumber, amt);
            }
            break;
            case 4:{
                System.out.println("Enter Account Number: ");
                int accountNumber = Integer.parseInt(sc.nextLine());
                b1.searchCustomer(accountNumber);;
            }
            break;
            case 5:{

                b1.displayAllCustomers();
            }
            break;
            case 6:{
                System.out.println("Enter Account Number: ");
                int accountNumber = Integer.parseInt(sc.nextLine());
                b1.enquiryBalance(accountNumber);
            }
            break;
            case 7:{
                isEnd = true;
            }
            break;
            default:{
                System.out.println("Invalid Option!");
            }
        }
        }
        
    }
}

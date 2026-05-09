import java.util.Scanner;
class ATM
{
    Scanner sc=new Scanner(System.in);
    int pin;
    User u;
    ATM(User x)
    {
        u=x;
    }
    boolean pinCheck()
    {
        int p=u.pin;
        String name=u.holderName;
        System.out.println("Welcome "+name+" please Enter your pin");
        int pin=0;
        while(true)
        {
            if(sc.hasNextInt())
            {
                pin=sc.nextInt();
                break;
            }
            else
            {
                System.out.println("Invalid Input");
                sc.next();
            }
        }
        if(pin==p)
        return true;
        else
        return false;
    }
    int menu()
    {
        System.out.println("1.) Check Balance");
        System.out.println("2.) Deposit Money");
        System.out.println("3.) Withdraw Money");
        System.out.println("4.) Exit");
        System.out.println("Write only the number of choice");
        int choice;
        while(true)
        {
            if(sc.hasNextInt())
            {
                choice=sc.nextInt();
                if(choice>=1 && choice<=4)
                break;
                else
                {
                    System.out.println("Invalid Input");
                }
            }
            else
            {
               System.out.println("Invalid Input");
               sc.next();
            }
        }
        return choice;
    }
    String use()
    {
        int choice=menu();
        if(choice==1)
        {
            u.display();
            return "continue";
        }
        else if(choice==2)
        {
            System.out.println("Enter the amount to deposit");
            int d;
            while(true)
            {
                if(sc.hasNextInt())
                {
                    d=sc.nextInt();
                    if(d>=1)
                    break;
                    else
                    {
                        System.out.println("Invalid Input");
                    }
                }
                else
                {
                    System.out.println("Invalid Input");
                    sc.next();
                }
            }
            u.addition(d);
            System.out.println("Deposit of "+d+" Successful !");
            u.display();
            return "continue";
        }
        else if(choice==3)
        {
            System.out.println("Enter the amount to withdraw");
            int w;
            while(true)
            {
            if(sc.hasNextInt())
            {
                w=sc.nextInt();
                if(u.balance>=w && w>=0)
                    break;
                else if(w<0)
                   System.out.println("Invalid Input");
                else
                {
                   System.out.println("Insufficient Balance");
                }
            }
            else
            {
                System.out.println("Invalid Input");
                sc.next();
            }
            }
            u.reduce(w);
            System.out.println("Withdrawal of "+w+" Successful !");
            u.display();
            return "continue";
        }
        else
        {
            System.out.println("Thank you for using ATM");
            return "exit";
        }
    }
    public static void main()
    {
        int p; int b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name of the Account Holder");
        String n=sc.nextLine();
        System.out.println("Set 4 digit Pin");
        while(true)
        {
            if(sc.hasNextInt())
            {
                p=sc.nextInt();
                if(p>=1000 && p<=9999)
                break;
                else
                System.out.println("Pin should be only of 4 digits");
            }
            else
            {
                System.out.println("Invalid Input");
                sc.next();
            }
        }
        System.out.println("Enter Initial Balance");
        while(true)
        {
            if(sc.hasNextInt())
            {
                b=sc.nextInt();
                break;
            }
            else
            {
                System.out.println("Invalid Input");
                sc.next();
            }
        }
        User u1=new User(n,b,p);
        ATM a1=new ATM(u1);
        if(a1.pinCheck())
        {
            while(true)
            {
                String u=a1.use();
                if(u.equals("exit"))
                break;
            }
        }
        else
        {
            System.out.println("Wrong Pin ! Access Denied");
        }
    }
}

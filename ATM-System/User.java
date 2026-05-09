import java.util.Scanner;
class User
{
    Scanner sc=new Scanner(System.in);
    String holderName;
    int balance;
    int pin;
    User(String h,int b,int p)
    {
        holderName=h;
        balance=b;
        pin=p;
    }
    void display()
    {
        System.out.println("Account Holder Name : "+holderName);
        System.out.println("Balance : "+balance);
    }
    void addition(int amount)
    {
        balance=balance+amount;
    }
    void reduce(int amount)
    {
        balance=balance-amount;
    }
}

package OOPs4.Encapsulation;

class Account{
    /*private*/ int balance=100;
    String password="123";

    //getter
    public int getBalance(){
        return balance;
    }
    //setter
    public void setBalance(int balance, String userPassword){
        if(userPassword==password){
        this.balance=balance;
        }
    }
}
public class Encapsulation {
    //account-balance
    public static void main(String[] args) {
        Account obj=new Account();
        System.out.println(obj.balance);
        obj.balance=0;
        System.out.println(obj.balance);
    }
}

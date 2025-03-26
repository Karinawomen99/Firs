package dz2;

public class BankAccount {
    String owner;
    double balance;
    public  BankAccount(String owner,double balance) {
        this.owner = owner;
        this.balance = balance;}
    public String getOwner(){return owner;}
    public double getBalance(){return balance;}
    public void setOwner (String owner) {this.owner = owner;}

    public void deposit (double amount){
        balance += amount;}
    public void withdraw(double amount){
        balance -= amount;}
    public void printBalance (){
        System.out.println("Текущий баланс:" + balance);

    }

}

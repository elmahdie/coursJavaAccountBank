public class Account {
    private double balance=0.0;
    private double interst=0.02;
    private int accountNumbre;
    private static int numbreOfAccount=1000000;

    

    public Account() {
        this.accountNumbre = numbreOfAccount+=1;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getInterst() {
        return interst*100;
    }
    public void setInterst(double interst) {
        this.interst = interst;
    }
    public int getAccountNumbre() {
        return accountNumbre;
    }

    public void verser(double amount){
        if(amount<0){
            System.out.println("impossible negetive numbre ");
            return;
        }else{
            amount=amount+amount*interst;
            checkIntrest();
            this.balance=this.balance+amount;
            System.out.println("vous avez verser "+amount+" de votre compte avec intrest "+interst*100+ "%");
            System.out.println("votre sole acctuel est : "+balance);

        }

    }

    public void retirer(double amount){
        if(amount+5>balance){
            System.out.println("vous navez pas assez d argent !!");
            return;
        }
        this.balance=this.balance-amount;
        checkIntrest();
        System.out.println("vous avez retire"+amount+" de votre compte");
        System.out.println("votre sole acctuel est : "+balance);
        

    }
    public void checkIntrest() {  // private => public voir saving
        if(balance>10000){
            interst=0.05;
        }else{interst=0.02;}
    }

    
    
}

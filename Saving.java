public class Saving  extends Account{
    private static String accountType="Saving";

    public Saving(Double initialSold) {
        super();
        this.checkIntrest();
        this.setBalance(initialSold);
        // 
        // if(initialSold>1000){
        //     this.setBalance(0.05);
        // }else{
        //     this.setBalance(0.02);
        // }
    }
    @Override
    public String toString() {
        return "type de compte "+accountType+" account\n"
        +"numbre de compte "+this.getAccountNumbre()+"\n"
        +"sold "+this.getBalance()+" \n"
        +"pourcentage interet "+this.getInterst()+" %\n";
    }

    
}

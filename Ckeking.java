public class Ckeking extends Account{
    private static String accountType="Checking";
    
    public Ckeking(Double initialSold) {
        super();
        this.setBalance(initialSold);
        this.checkIntrest();
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

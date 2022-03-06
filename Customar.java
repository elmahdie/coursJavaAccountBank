public class Customar {

    private final String fname;
    private final String cpno;
    private final String lname;
    private final Account account;

    public Customar(String fname, String lname, String cpno, Account account) {
        this.fname=fname;
        this.lname=lname;
        this.cpno=cpno;
        this.account=account;
    }

    @Override
    public String toString() {
        return "\tCustomar information\n"+" cpno : " + cpno + "\nlLast name : " + lname+
        "\nfirst name=" + fname +
        "\naccount " + account;
    }
    
    
}

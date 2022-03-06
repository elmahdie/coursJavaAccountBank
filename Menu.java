import java.util.Scanner;
//42
public class Menu {
static Scanner keyboard = new Scanner(System.in);
Bank bank= new Bank();
static boolean exist;

    public static void main(String[] args) {
        Menu menu=new Menu();
        menu.runMenu();
    
    }
    public static void runMenu() {
        printMeader();
        while (!exist) {
            printMenu();
            int choise=getInput();
            performAction(choise);
        }
        
    }
    private static int getInput() {
        int choise=-1;
        do{
            System.out.print("votre chois SVP ");
            try {
                choise=Integer.parseInt(keyboard.nextLine());
            } catch (NumberFormatException e) {
             System.out.print("introduire un numbre SVP ");
            }
            if(choise<0|| choise >4){
                System.out.println("respecter le menu SVP ");
            }
        }while(choise<0|| choise >4);
        return choise;
    }
    
    private static void printMenu() {
        System.out.println("votre chois SVP");
        System.out.println("1- Creer un compte\n2- Verser de Largent\n3- Retire de Largent\n 4- Vu Solde\n0- sortir");
    }
    private static void printMeader() {
        System.out.println("--------------------------------------------------------------------");
        System.out.println("|                  bienvenu dans notre banque                       |");
        System.out.println("|                           Baque CDA                               |");
        System.out.println("--------------------------------------------------------------------");
    }
    private static void performAction(int choise) {
        switch (choise) {
            case 0:
            System.out.println("aurevoir");
            System.exit(0);
                break;
                case 1:
                System.out.println("creer un compte");
                creerCompte();
                
                    break;
                case 2:
                System.out.println("verser");
                faireverrser();
                break;
                case 3:
                System.out.println("retire");
                faireretirer();
                break; 
                case 4:
                System.out.println("vu solde");
                fairevuSolde();
                
                break;       
        default:
        System.out.println("choix ne correct");
                break;
        }
    }
    private static void fairevuSolde() {
    }
    private static void faireretirer() {
    }
    private static void faireverrser() {
    }

    private static void creerCompte() {
        String fname,lname,cpno,accountType="";
        Double initialSold=0d;
        boolean valid=false;
        while (!valid) {
            System.out.print("choisir type de compte : ");
            accountType=keyboard.nextLine();
            if(accountType.equalsIgnoreCase("cheking")||accountType.equalsIgnoreCase("Saving)")){
                valid=true;
            }else{
                System.out.println("svp soit cheking soit Saving");
            }

        }
        System.out.print("votre nom svp ");
        fname=keyboard.nextLine();
        System.out.print("votre prenom svp ");
        lname=keyboard.nextLine();
        System.out.print("ssn svp : ");
        cpno=keyboard.nextLine();

        valid=false;
       // 
    
    while(!valid){
        System.out.print("initial soldsvp : ");
    try {
        initialSold=Double.parseDouble(keyboard.nextLine());
        
    } catch (NumberFormatException e) {
        System.out.println("doit etre double");
    }
    if(accountType.equalsIgnoreCase("cheking")){
        if(initialSold<100){
            System.out.println("il faut minimum 100 euro pour ce type de compte ! ");
        }
        else{
            valid=true;
        }
    }
    else if(accountType.equalsIgnoreCase("saving")){
        if(initialSold<50){
            System.out.println("il faut minimum 501 euro pour ce type de compte ! ");
        }
        else{
            valid=true;
        }
    }

    }
    Account account;
    if(accountType.equalsIgnoreCase("cheking")){
        account= new Ckeking(initialSold);
    }else{
        account= new Saving(initialSold);
    }
    Customar customar=new Customar(fname,lname,cpno,account);
    Bank.addCustomer(customar);


    }
    
}
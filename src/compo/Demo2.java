package compo;

public class Demo2 {

    public static void main(String[] args) {
        CompositeAccount account=new CompositeAccount();

        account.addAccount(new SavingAccount());
        account.addAccount(new CurrentAccount());
        System.out.println(account.getBalance());
    }
}

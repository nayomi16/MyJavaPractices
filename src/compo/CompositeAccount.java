package compo;

import java.util.ArrayList;
import java.util.List;

public class CompositeAccount implements Account {

    private float totalBalance;
    private List<Account> accounts = new ArrayList<>();

    @Override
    public float getBalance() {
        for (Account f: accounts) {
            totalBalance+=f.getBalance();
        }
        return totalBalance;
    }

    public void addAccount(Account account){
        accounts.add(account);
    }
}

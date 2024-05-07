package clients;

import hhomework26.SoundEngineer;
import lesson27.Account;
import lesson27.CheckingAccount;
import lesson27.User;

public class TestClient {
    public static void main(String[] args) {
        User user = new User();
        System.out.println(user.toString());
        Account account = new Account(1000);
        System.out.println(account.getBalance());

        CheckingAccount checkingAccount = new CheckingAccount(1000, 500);
        checkingAccount.withdraw(1200);
        System.out.println(checkingAccount.getBalance());
    }
}

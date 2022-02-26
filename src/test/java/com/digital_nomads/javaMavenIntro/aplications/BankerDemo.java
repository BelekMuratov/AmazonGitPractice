package com.digital_nomads.javaMavenIntro.aplications;
import static com.digital_nomads.javaMavenIntro.aplications.Bank.*;
public class BankerDemo {
    public static void main(String[] args) throws Exception {
        DemirBank uriDemirbamkAccount = new DemirBank(416958534057l,123456789);
        DemirBank dosDemirbankAcoount = new DemirBank(416958531647l,987654321);
        System.out.println(uriDemirbamkAccount.getBalance());
        uriDemirbamkAccount.deposit(5000);
        System.out.println(uriDemirbamkAccount.getBalance());
        transferFunds(uriDemirbamkAccount,dosDemirbankAcoount,45);
        System.out.println(uriDemirbamkAccount + "  after transfer");
        transferFunds(dosDemirbankAcoount,uriDemirbamkAccount,145);
        System.out.println("Dos's balnce after transfer  " + dosDemirbankAcoount.getBalance());
    }
}

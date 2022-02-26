package step_defs;

import com.digital_nomads.javaMavenIntro.aplications.DemirBank;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.sl.In;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;

import java.util.List;

public class BankApps {
    DemirBank uriDemirBank;
    @Given("user should register to bank with following data")
    public void user_should_register_to_bank_with_following_data(io.cucumber.datatable.DataTable dataTable) throws Exception {
        List<List<String>> number = dataTable.asLists(String.class);
        long accNumber = Long.parseLong(number.get(1).get(0));
        long routNumber = Long.parseLong(number.get(1).get(1));
        uriDemirBank = new DemirBank(accNumber,routNumber);
        System.out.println(uriDemirBank.getAccountNumber());
        System.out.println(uriDemirBank.getRoutingNumber());
    }
    @Then("user should be successfully register the  bank with following data")
    public void user_should_be_successfully_register_the_bank_with_following_data(io.cucumber.datatable.DataTable dataTable) {

        List<List<String>> number1 = dataTable.asLists(String.class);
        long accNumber = Long.parseLong(number1.get(1).get(0));
        long routNumber = Long.parseLong(number1.get(1).get(1));

        Assertions.assertEquals(accNumber,uriDemirBank.getAccountNumber());
        Assertions.assertEquals(routNumber,uriDemirBank.getRoutingNumber());
    }
}

package models_1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import statics.TransactionMessages;

import java.time.LocalDateTime;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

class AccountTest {

    static Account account;

    @BeforeAll
    public static void setup() {
        account = new Account();
        account.setBalance(0);
        account.setFirstName("ABBASSEN");
        account.setLastName("Mohamed Redha");
        account.setBirthDate(LocalDateTime.now());
        account.setAddress(new Address("Paris", "Boulvard Serrurier", 169, "France"));
    }

    @Test
    void transactionTest() throws Exception {
        assertThat(account.getBalance()).isEqualTo(0);

        account.deposit(100);

        assertThat(account.getBalance()).isEqualTo(100);

        account.withdraw(100);

        assertThatThrownBy(() -> {
            account.withdraw(100);
        }).isInstanceOf(Exception.class).hasMessageContaining("" + TransactionMessages.BALANCE_INSUFFICIENT);
    }
}
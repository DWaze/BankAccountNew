package models_1;

import com.google.gson.Gson;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import statics.TransactionDisplayType;
import statics.TransactionType;

import java.time.LocalDateTime;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TransactionsHistoryTest {


    static Account account;
    static Gson gson;

    @BeforeAll
    public static void setup() throws Exception {
        gson = new Gson();
        account = new Account();
        account.setBalance(0);
        account.setFirstName("ABBASSEN");
        account.setLastName("Mohamed Redha");
        account.setBirthDate(LocalDateTime.now());
        account.setAddress(new Address("Paris", "Boulvard Serrurier", 169, "France"));

        account.deposit(100);

        account.withdraw(100);

        account.deposit(1);
    }

    @Test
    void addTransaction() {
        Transaction transaction = new Transaction(
                new Random().nextInt(),
                LocalDateTime.now(), 100,
                TransactionType.DEPOSIT
        );

        Transaction transaction2 = new Transaction(
                new Random().nextInt(),
                LocalDateTime.now(), 200,
                TransactionType.DEPOSIT
        );

        account.getTransactionsHistory().getTransactionsHistories().add(transaction);

        assertTrue(account.getTransactionsHistory().getTransactionsHistories().contains(transaction));
    }

    @Test
    void removeTransaction() {
        Transaction transaction = new Transaction(
                new Random().nextInt(),
                LocalDateTime.now(), 100,
                TransactionType.DEPOSIT
        );

        account.getTransactionsHistory().getTransactionsHistories().add(transaction);
        account.getTransactionsHistory().removeTransaction(transaction.getId());

        assertFalse(account.getTransactionsHistory().getTransactionsHistories().contains(transaction));
    }

    @Test
    void showTransactions() throws Exception {
        account.getTransactionsHistory().showTransactions(TransactionDisplayType.JSON_FORMAT);
        assertTrue(() -> {
            gson.fromJson(account.getTransactionsHistory().showTransactions(TransactionDisplayType.JSON_FORMAT)
                    , Object.class);
            return true;
        });
    }
}
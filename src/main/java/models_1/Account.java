package models_1;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import statics.TransactionMessages;
import statics.TransactionType;

import java.time.LocalDateTime;
import java.util.Random;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
public class Account extends User implements AccountOperations {

    private int balance;
    private TransactionsHistory transactionsHistory = new TransactionsHistory();

    @Override
    public TransactionResponse deposit(int depositAmount) {
        this.balance += depositAmount;
        Transaction transaction = new Transaction(
                new Random().nextInt(),
                LocalDateTime.now(), depositAmount,
                TransactionType.DEPOSIT
        );
        transactionsHistory.addTransaction(transaction);
        return new TransactionResponse(this.balance, TransactionMessages.DEPOSIT_SUCCESSFUL);
    }

    @Override
    public TransactionResponse withdraw(int withdrawAmount) throws Exception {
        if (balance >= withdrawAmount) {
            balance -= withdrawAmount;
            Transaction transaction = new Transaction(
                    new Random().nextInt(),
                    LocalDateTime.now(),
                    withdrawAmount,
                    TransactionType.WITHDRAW
            );
            transactionsHistory.addTransaction(transaction);
            return new TransactionResponse(this.balance, TransactionMessages.WITHDRAW_SUCCESSFUL);
        }
        throw new Exception(""+TransactionMessages.BALANCE_INSUFFICIENT);
    }
}

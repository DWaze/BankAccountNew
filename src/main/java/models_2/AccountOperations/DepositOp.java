package models_2.AccountOperations;


import models_2.Accounts.Account;
import models_2.Transaction;
import statics.TransactionMessages;
import statics.TransactionType;

import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicInteger;

public class DepositOp implements AccountOperations {
    @Override
    public TransactionMessages transaction(int depositAmount, Account account) {
        account.setBalance(account.getBalance() + depositAmount);
        Transaction transaction = new Transaction(
                new AtomicInteger().incrementAndGet(),
                LocalDateTime.now(), depositAmount,
                TransactionType.DEPOSIT
        );
        account.getTransactionsHistory().addTransaction(transaction);
        return TransactionMessages.DEPOSIT_SUCCESSFUL;
    }
}
